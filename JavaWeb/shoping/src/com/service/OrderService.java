package com.service;

import com.entity.Order;
import com.entity.OrderItem;
import com.entity.ShopCar;

import java.util.List;

public interface OrderService {
    /**
     * 创建订单
     * @param shopCar
     * @param userId
     * @return
     */
    public String createOrder(ShopCar shopCar, Integer userId);

    /**
     * 查看我的订单
     * @param userId
     * @return
     */
    public List<Order> showMyOrders(Integer userId);

    //查看订单详情
    public List<OrderItem> showOrderDetail(String orderId);

    /**
     * 查询所有订单
     * @return
     */
    public List<Order> allOrders();

    /**
     * 发货
     * @param orderId
     * @return
     */
    public int sendOrder(String orderId);


    /**
     * 发货
     * @param orderId
     * @return
     */
    public int receiveOrder(String orderId);
}
