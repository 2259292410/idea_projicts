package com.web;

import com.entity.Book;
import com.entity.User;
import com.google.gson.Gson;
import com.service.UserService;
import com.service.impl.UserServiceImpl;
import com.utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebEndpoint;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY;

public class UserServlet extends BaseServlet {
    private UserService userService = new UserServiceImpl();

    /**
     * 用户登录
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取用户名和密码
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        User loginUser = userService.login(new User(null, username, password, null));
        if (loginUser == null) {
            //   跳回登录页面
            req.setAttribute("msg", "Error:用户名或密码错误!");
            req.setAttribute("username", username);
            req.getRequestDispatcher("/pages/user/login.jsp").forward(req, resp);
        } else {
            // 登录 成功
            req.getSession().setAttribute("user", loginUser);
            //跳到成功页面
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        }
    }

    /**
     * 退出登录
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void logout(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().invalidate();
        resp.sendRedirect(req.getContextPath());
    }

    /**
     * 注册用户
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void regist(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取Session中的验证码
        String token = (String) req.getSession().getAttribute(KAPTCHA_SESSION_KEY);
        // 删除 Session中的验证码
        req.getSession().removeAttribute(KAPTCHA_SESSION_KEY);

        //获取用户输入的参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String code = req.getParameter("code");

        //判断验证码是否输入正确
        if (token != null && token.equalsIgnoreCase(code)) {
            User user = new User(null, username, password, email);
            userService.registUser(user);
            // 注册 成功
            req.getSession().setAttribute("user", user);
            req.getRequestDispatcher("/pages/user/regist_success.jsp").forward(req, resp);
        }else {
            // 把回显信息，保存到Request域中
            req.setAttribute("msg", "验证码错误！！");
            req.setAttribute("username", username);
            req.setAttribute("password",password);
            req.setAttribute("email", email);

            req.getRequestDispatcher("/pages/user/regist.jsp").forward(req, resp);
        }



    }

    /**
     * 以Ajax的形式判断用户名是否可用
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void existsUsername(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        boolean b = userService.existsUsername(username);
        Map<String, Object> result = new HashMap<String, Object>();
        //如果用户存在返回1，不存在返回0
        if (b) {
            result.put("result",1);
        }else {
            result.put("result",0);
      }
        // 生成 Gson 对象，用于把 map 转换成为 json 字符串返回
        Gson gson = new Gson();
        String json = gson.toJson(result);
        resp.getWriter().write(json);
    }

    /**
     * 查询所有用户
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void queryUser(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> user = userService.queryUser();
        req.setAttribute("user",user);
        req.getRequestDispatcher("pages/manager/allUser.jsp").forward(req,resp);
    }

    protected void addUser(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = WebUtils.copyParamToBean(req.getParameterMap(), new User());
        userService.addUser(user);

    }

    protected void deleteUser(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = WebUtils.parseInt(req.getParameter("id"),0);
        userService.deleteUser(id);
        queryUser(req,resp);
    }
}
