package com.dao;

import com.entity.Order;

import java.util.List;

public interface OrderDao {
    /**
     * 保存订单
     * @param order
     * @return
     */
    public int saveOrder(Order order);

    /**
     * 查询全部订单
     * @return
     */
    public List<Order> queryAllOrders();

    /**
     * 修改订单状态
     * @param orderId
     * @param status
     */
    public  int  changeOrderStatus(String orderId,Integer status);

    /**
     * 根据用户编号查询订单信息
     * @param userId
     * @return
     */
    public List<Order> queryOrderByUserId(Integer userId);

}
