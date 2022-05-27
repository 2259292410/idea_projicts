package com.servlet;

import com.entity.Membersinfo;
import com.google.gson.Gson;
import com.service.impl.MembersinfoSErviceImpl;
import com.utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AjaxServlet extends BaseServlet {
    protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Membersinfo membersinfo1 = WebUtils.copyParamToBean(request.getParameterMap(), new Membersinfo());
        new MembersinfoSErviceImpl().update(membersinfo1);
    }


}
