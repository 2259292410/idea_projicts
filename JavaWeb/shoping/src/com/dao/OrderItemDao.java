package com.dao;

import com.entity.Order;
import com.entity.OrderItem;

import java.util.List;

public interface OrderItemDao {
    //保存订单项
    public int saveOrderItem(OrderItem orderItem);

    //根据订单号查询订单明细
    public List<OrderItem> queryOrderItemByOrderId(String orderId);
}
