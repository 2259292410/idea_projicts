package com.test;

import com.dao.OrderDao;
import com.dao.OrderItemDao;
import com.dao.impl.OrderDaoImpl;
import com.dao.impl.OrderItemDaoImpl;
import com.entity.Order;
import com.entity.ShopCar;
import com.entity.ShopCarItem;
import com.service.OrderService;
import com.service.impl.OrderServiceImpl;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

public class OrderServiceImplTest {

    @Test
    public void createOrder() {
        ShopCar shopCar =new ShopCar();
        shopCar.addItem(new ShopCarItem(1, "java从入门到精通", 1, new BigDecimal(1000),new BigDecimal(1000),"123"));
        shopCar.addItem(new ShopCarItem(1, "java从入门到精通", 1, new BigDecimal(1000),new BigDecimal(1000),"321"));
        shopCar.addItem(new ShopCarItem(2, "数据结构与算法", 2, new BigDecimal(100),new BigDecimal(200),null));

        OrderService orderService = new OrderServiceImpl();
        System.out.println( "订单号是：" + orderService.createOrder(shopCar, 1) );

    }

    @Test
    public void showMyOrders(){
        OrderDao orderDao = new OrderDaoImpl();
        List<Order> orders = orderDao.queryOrderByUserId(1);
        System.out.println(orders);
    }

    @Test
    public  void showOrderDetail(){
        OrderService orderService =new OrderServiceImpl();
        System.out.println(orderService.showOrderDetail("16399886693301"));
    }
}