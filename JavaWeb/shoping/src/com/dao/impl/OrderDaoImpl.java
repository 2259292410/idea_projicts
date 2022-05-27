package com.dao.impl;

import com.dao.OrderDao;
import com.entity.Order;

import java.util.List;

public class OrderDaoImpl extends BaseDao implements OrderDao {
    @Override
    public List<Order> queryAllOrders() {
        String sql="SELECT `order_id` as orderId,`create_time` as createTime,`price`,`status`,`user_id` as userId FROM `order`";
        return  queryForList(Order.class,sql);
    }

    @Override
    public int changeOrderStatus(String orderId, Integer status) {
            String sql="UPDATE `order` SET `status` =? WHERE order_id=?";
       return update(sql, status, orderId);
    }

    @Override
    public List<Order> queryOrderByUserId(Integer userId) {
        String sql ="SELECT order_id as orderId,create_time AS createTime,price,`status`,user_id as userId FROM `order` WHERE user_id=?";
        List<Order> orders = queryForList(Order.class, sql, userId);
        return orders;
    }

    @Override
    public int saveOrder(Order order) {
        String sql = "insert into `order`(`order_id`,`create_time`,`price`,`status`,`user_id`) values(?,?,?,?,?)";
        return update(sql, order.getOrderId(), order.getCreateTime(), order.getPrice(), order.getStatus(), order.getUserId());
    }
}
