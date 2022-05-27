package com.web;

import com.entity.Book;
import com.entity.ShopCar;
import com.entity.ShopCarItem;
import com.entity.User;
import com.google.gson.Gson;
import com.service.BookService;
import com.service.impl.BookServiceImpl;
import com.utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class ShopCarServlet extends BaseServlet {

    private BookService bookService = new BookServiceImpl();

    /**
     * 修改商品数量
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void updateCount(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = WebUtils.parseInt(req.getParameter("id"), 0);
        int count = WebUtils.parseInt(req.getParameter("count"), 1);
        ShopCar shopCar = (ShopCar) req.getSession().getAttribute("shopCar");
        if (shopCar != null) {
            shopCar.updateCount(id, count);
        }

    }

    /**
     * 清空购物车
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void clear(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ShopCar shopCar = (ShopCar) req.getSession().getAttribute("shopCar");
        if (shopCar != null) {
            shopCar.clear();
        }
// 重定向回原来商品所在的地址页面
        resp.sendRedirect(req.getHeader("Referer"));
    }

    /**
     * 删除购物车商品项
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void deleteItem(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = WebUtils.parseInt(req.getParameter("id"), 0);
        // 获取购物车对象
        ShopCar cart = (ShopCar) req.getSession().getAttribute("shopCar");
        if (cart != null) {
            cart.deleteItem(id);
        }
        // 重定向回原来商品所在的地址页面
        resp.sendRedirect(req.getHeader("Referer"));
    }

    /**
     * 添加购物车商品项
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void addItem(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Gson gson = new Gson();
        String json=gson.toJson(false);

        //判断用户是否已经登录
        User user = (User)req.getSession().getAttribute("user");
        if (user==null){
            resp.getWriter().write(json);
        }else {
            int bookId = WebUtils.parseInt(req.getParameter("bookId"), 0);
            Book book = bookService.queryBookById(bookId);
            ShopCarItem shopCarItem = new ShopCarItem(book.getId(), book.getName(), 1, book.getPrice(), book.getPrice(), book.getImg_path());
            ShopCar shopCar = (ShopCar) req.getSession().getAttribute("shopCar");
            if(shopCar==null){
                shopCar = new ShopCar();
                req.getSession().setAttribute("shopCar",shopCar);
            }
            shopCar.addItem(shopCarItem);

            json = gson.toJson(true);
            resp.getWriter().write(json);


            // 重定向回原来商品所在的地址页面
//            resp.sendRedirect(req.getHeader("Referer"));
        }

    }

}
