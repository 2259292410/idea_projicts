package com.atguigu.service;

import com.atguigu.pojo.Cart;
import com.atguigu.pojo.Order;
import com.atguigu.pojo.OrderItem;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.List;

public interface OrderService {
    //生成订单
    public String createOrder(Cart cart, Integer userId);

    //查询全部订单
    public List<Order> showAllOrders();

    //发货
    public void sendOrder(Integer orderId);

    //查看订单详情
    public Order showOrderDetail(String orderId);

    //查看我的订单
    public List<Order> showMyOrders(Integer userId);

    //签收订单/确认收货
    public void receiverOrder(Integer orderId);
}

