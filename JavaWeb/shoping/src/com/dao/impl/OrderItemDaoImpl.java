package com.dao.impl;

import com.dao.OrderItemDao;
import com.entity.Order;
import com.entity.OrderItem;

import java.util.List;

public class OrderItemDaoImpl extends BaseDao implements OrderItemDao {
    @Override
    public List<OrderItem> queryOrderItemByOrderId(String orderId) {
        String sql ="SELECT `id`,`name`,`count`,`price`,`total_price` as totalPrice,`order_id` as orderId,`img_path` \n" +
                "\tFROM order_item WHERE order_id = ?;";
        return queryForList(OrderItem.class, sql, orderId);
    }

    @Override
    public int saveOrderItem(OrderItem orderItem) {
        String sql = "insert into order_item(`name`,`count`,`price`,`total_price`,`order_id`,`img_path`) values(?,?,?,?,?,?)";
        return update(sql, orderItem.getName(), orderItem.getCount(), orderItem.getPrice(), orderItem.getTotalPrice(), orderItem.getOrderId(),orderItem.getImg_path());
    }
}
