package com.service.impl;

import com.dao.BookDao;
import com.dao.OrderDao;
import com.dao.OrderItemDao;
import com.dao.impl.BaseDao;
import com.dao.impl.BookDaoImpl;
import com.dao.impl.OrderDaoImpl;
import com.dao.impl.OrderItemDaoImpl;
import com.entity.*;
import com.service.OrderService;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class OrderServiceImpl extends BaseDao implements OrderService {
    private OrderDao orderDao = new OrderDaoImpl();
    private OrderItemDao orderItemDao = new OrderItemDaoImpl();
    private BookDao bookDao=new BookDaoImpl();

    @Override
    public String createOrder(ShopCar shopCar, Integer userId) {
        // 订单号===唯一性
        String orderId = System.currentTimeMillis() + "" + userId;
        // 创建一个订单对象
        Order order = new Order(orderId, new Date(), shopCar.getTotalPrice(), 0, userId);
        // 保存订单
        orderDao.saveOrder(order);

        // 遍历购物车中每一个商品项转换成为订单项保存到数据库
        for (Map.Entry<Integer, ShopCarItem> entry : shopCar.getItems().entrySet()) {
            // 获取每一个购物车中的商品项
            ShopCarItem shopCarItem = entry.getValue();

            // 转换为每一个订单项
            OrderItem orderItem = new OrderItem(null, shopCarItem.getName(), shopCarItem.getCount(), shopCarItem.getPrice(), shopCarItem.getTotalPrice(), orderId,shopCarItem.getImg_path());
            // 保存订单项到数据库
            orderItemDao.saveOrderItem(orderItem);

            //更新库存和销量
            Book book = bookDao.queryBookById(shopCarItem.getId());
            book.setSales(book.getSales() + shopCarItem.getCount());
            book.setStock(book.getStock() - shopCarItem.getCount());
            bookDao.updateBook(book);
        }

        // 清空购物车
        shopCar.clear();
        return orderId;
    }

    @Override
    public List<Order> showMyOrders(Integer userId) {
        return orderDao.queryOrderByUserId(userId);
    }

    @Override
    public List<OrderItem> showOrderDetail(String orderId) {
        return orderItemDao.queryOrderItemByOrderId(orderId);
    }

    @Override
    public List<Order> allOrders() {
        return orderDao.queryAllOrders();
    }

    @Override
    public int sendOrder(String orderId) {
        return orderDao.changeOrderStatus(orderId,1);
    }

    @Override
    public int receiveOrder(String orderId) {
        return orderDao.changeOrderStatus(orderId,2);
    }
}
