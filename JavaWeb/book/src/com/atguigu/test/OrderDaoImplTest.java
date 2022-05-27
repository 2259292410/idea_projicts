package com.atguigu.test;

import com.atguigu.dao.OrderDao;
import com.atguigu.dao.impl.OrderDaoImpl;
import com.atguigu.pojo.Order;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;

import static org.junit.Assert.*;

public class OrderDaoImplTest {
    private OrderDao orderDao = new OrderDaoImpl();

    @Test
    public void saveOrder() {

        orderDao.saveOrder(new Order("1234567891", new Date(), new BigDecimal(100), 0, 1));
    }

    @Test
    public void queryOrders() {
    }

    @Test
    public void changeOrderStatus() {
    }

    @Test
    public void queryOrderByUserId() {
        System.out.println(orderDao.queryOrderByUserId(1));
    }
}