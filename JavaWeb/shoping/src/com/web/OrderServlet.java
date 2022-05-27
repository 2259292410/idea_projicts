package com.web;

import com.entity.Order;
import com.entity.OrderItem;
import com.entity.ShopCar;
import com.entity.User;
import com.service.OrderService;
import com.service.UserService;
import com.service.impl.OrderServiceImpl;
import com.service.impl.UserServiceImpl;
import com.utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class OrderServlet extends BaseServlet {
    private OrderService orderService = new OrderServiceImpl();
private UserService userService = new UserServiceImpl();

    /**
     * 生成订单
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void createOrder(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        // 先获取 Cart 购物车对象
        ShopCar shopCar = (ShopCar) req.getSession().getAttribute("shopCar");
        // 获取 Userid
        User loginUser = (User) req.getSession().getAttribute("user");
        if (loginUser == null) {
            req.getRequestDispatcher("/pages/user/login.jsp").forward(req, resp);
            return;
        }
        Integer userId =userService.queryByUserId(loginUser.getUsername());
        // 调用 orderService.createOrder(Cart,Userid);生成订单
        String orderId = orderService.createOrder(shopCar, userId);

        req.getSession().setAttribute("orderId", orderId);
        resp.sendRedirect(req.getContextPath() + "/pages/shopCar/checkout.jsp");
    }


    /**
     * 查看我的订单
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void showMyOrder(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取 User 用户对象
        User user = (User) req.getSession().getAttribute("user");
        //查看用户是否登录
        if (user == null) {
            req.getRequestDispatcher("/pages/user/login.jsp").forward(req, resp);
            return;
        }
        //获取用户id
        Integer userId =userService.queryByUserId(user.getUsername());

        List<Order> orders = orderService.showMyOrders(userId);

        req.getSession().setAttribute("orders",orders);

        resp.sendRedirect(req.getContextPath() + "/pages/order/order.jsp");
    }

    /**
     * 查看订单详情
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void showMyOrderDetail(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取订单号
        String orderId = req.getParameter("orderId");
        req.setAttribute("orderId",orderId);
        //获取订单时间
        String createTime = req.getParameter("createTime");
        req.setAttribute("createTime",createTime);
        //获取发货状态
        String status = req.getParameter("status");
        req.setAttribute("status",status);
        //获取订单总价
        String orderTotalPrice = req.getParameter("price");
        req.setAttribute("orderTotalPrice",orderTotalPrice);


        List<OrderItem> orderItems = orderService.showOrderDetail(orderId);
       if (orderItems!=null) {
           req.getSession().setAttribute("orderItems",orderItems);
       }
        req.getRequestDispatcher("pages/order/orderDetails.jsp").forward(req,resp);

    }

    /**
     * 产看所有订单
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void allOrders(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Order> orders = orderService.allOrders();
        req.setAttribute("orders",orders);
        req.getRequestDispatcher("pages/manager/allOrder.jsp").forward(req,resp);
    }

    /**
     * 发货
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void sendOrder(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String orderId = req.getParameter("orderId");
        orderService.sendOrder(orderId);
        allOrders(req,resp);
    }

    /**
     * 签收
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void receiveOrder(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    /**
     * 订单详情
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void orderDetails(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String orderId = req.getParameter("orderId");
        List<OrderItem> orderItems = orderService.showOrderDetail(orderId);
        req.setAttribute("orderItems",orderItems);
        req.getRequestDispatcher("pages/manager/orderDetails.jsp").forward(req,resp);
    }

}
