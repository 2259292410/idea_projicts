package com.servlet;

import com.entity.Membersinfo;
import com.service.MembersinfoService;
import com.service.impl.MembersinfoSErviceImpl;
import com.utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.print.Book;
import java.io.IOException;
import java.util.List;

public class UserServlet extends BaseServlet {
    private MembersinfoService membersinfoService = new MembersinfoSErviceImpl();

    protected void list(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        List<Membersinfo> membersinfos = membersinfoService.queryList();
        request.setAttribute("membersinfos", membersinfos);
        request.getRequestDispatcher("user/user_manager.jsp").forward(request, response);
    }

    protected void getUser(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        int id = WebUtils.parseInt(request.getParameter("id"), 0);
        Membersinfo membersinfo = membersinfoService.queryUserById(id);
        request.setAttribute("membersinfo", membersinfo);
        request.getRequestDispatcher("/user/user_edit.jsp").forward(request, response);
    }

    protected void update(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        Membersinfo membersinfo1 = WebUtils.copyParamToBean(request.getParameterMap(), new Membersinfo());
        int update = membersinfoService.update(membersinfo1);
        System.out.println(membersinfo1);
        HttpSession session = request.getSession();
        if (update > 0) {
            session.setAttribute("msg", "msg");
        } else {
            session.setAttribute("msg", null);
        }
    }

    protected void delete(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        int id = WebUtils.parseInt(request.getParameter("id"), 0);
        membersinfoService.deleteMembersinfoById(id);
        response.sendRedirect("userServlet?action=list");

    }


}
