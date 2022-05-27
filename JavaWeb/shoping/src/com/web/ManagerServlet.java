package com.web;

import com.entity.Book;
import com.entity.Manager;
import com.google.gson.Gson;
import com.service.BookService;
import com.service.ManagerService;
import com.service.impl.BookServiceImpl;
import com.service.impl.ManagerServiceImpl;
import com.utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ManagerServlet extends BaseServlet {

    private BookService bookService = new BookServiceImpl();
    private ManagerService managerService = new ManagerServiceImpl();

    protected void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String manager_name = req.getParameter("manager_name");
        String password = req.getParameter("password");
        Manager manager = managerService.login(new Manager(null, manager_name, password));
        if (manager==null){
            req.setAttribute("msg","fail");
            req.getRequestDispatcher("pages/manager/mLogin.jsp").forward(req,resp);
        }else {
            req.getSession().setAttribute("manager",manager);
            req.getRequestDispatcher("pages/manager/index.jsp").forward(req, resp);
        }

    }

    protected void logout(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().invalidate();
        resp.sendRedirect("pages/manager/mLogin.jsp");
    }

        protected void listBook(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1 通过BookService查询全部图书
        List<Book> books = bookService.queryBooks();
        //2 把全部图书保存到Request域中
        req.setAttribute("books", books);
        //3、请求转发到allBook.jsp.jsp页面
        req.getRequestDispatcher("/pages/manager/allBook.jsp").forward(req, resp);

    }

//    protected void updateBook(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        int id = WebUtils.parseInt(req.getParameter("id"),0);
//        System.out.println(id);
//        Book book = bookService.queryBookById(id);
//        int i = bookService.updateBook(book);
//    }





}
