package com.test;

import com.dao.OrderItemDao;
import com.dao.impl.OrderItemDaoImpl;
import com.entity.OrderItem;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class OrderItemDaoImplTest {

    @Test
    public void saveOrderItem() {
        OrderItemDao orderItemDao = new OrderItemDaoImpl();
        orderItemDao.saveOrderItem(new OrderItem(null, "java 从入门到精通", 1, new BigDecimal(100), new BigDecimal(100), "1234567891","123"));
        orderItemDao.saveOrderItem(new OrderItem(null, "javaScript 从入门到精通", 2, new BigDecimal(100), new BigDecimal(200), "1234567891","123"));

        orderItemDao.saveOrderItem(new OrderItem(null, "Netty 入门", 1, new BigDecimal(100), new BigDecimal(100), "1234567891","123"));
    }

    @Test
    public void queryOrderItemByOrderId(){
        OrderItemDao orderItemDao = new OrderItemDaoImpl();
        System.out.println(orderItemDao.queryOrderItemByOrderId("16399886693301"));
    }
}