package com.atguigu.dao.impl;

import com.atguigu.dao.OrderDao;
import com.atguigu.pojo.Order;

import java.util.List;

public class OrderDaoImpl  extends BaseDao implements OrderDao {

    @Override
    public int saveOrder(Order order) {
            String sql="insert into t_order(`order_id`,`create_time`,`price`,`status`,`user_id`) values(?,?,?,?,?)";
            return update(sql,order.getOrderId(),order.getCreateTime(),order.getPrice(),order.getStatus(),order.getUserId());
    }

    @Override
    public List<Order> queryOrders() {
        return null;
    }

    @Override
    public void changeOrderStatus(Integer orderId, Integer status) {

    }

    @Override
    public List<Order> queryOrderByUserId(Integer userId) {
        String sql ="SELECT create_time as createTime,price,status FROM t_order WHERE user_id=?";
        List<Order> orders = queryForList(Order.class, sql, userId);
        return orders;
    }
}
