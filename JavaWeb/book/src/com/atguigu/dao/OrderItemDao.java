package com.atguigu.dao;

import com.atguigu.pojo.Order;
import com.atguigu.pojo.OrderItem;

public interface OrderItemDao {
    //保存订单项
    public  int   saveOrderItem(OrderItem orderItem);

    //根据订单号查询订单明细
    public Order queryOrderItemByOrderId(Integer orderId);

}
