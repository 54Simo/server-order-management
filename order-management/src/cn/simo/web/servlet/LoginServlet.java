package cn.simo.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.simo.domain.User;
import cn.simo.service.UserService;
import net.sf.json.JSONObject;

/**
 * 用户登录servlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// wxlogin
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// login
		request.setCharacterEncoding("utf-8");
		String phone = request.getParameter("phone");
		String password = request.getParameter("password");
		User user = null;
		try {
			// 0. 调用UserService.login()，返回值 user
			user = new UserService().login(phone,password);
			// 1. 判断user，将信息转发到msgservlet
			if (user == null) {
			    String mString = "{msg:'登录失败!',	userinfo:{},result: 0}";
				request.setAttribute("msg", mString);
			} else {
				String mString = "{msg:'登录成功!',	userinfo:" + JSONObject.fromObject(user).toString() + ",result: 1}";
				request.setAttribute("msg", mString);
			}
			// 请求转发给msgservlet
			request.getRequestDispatcher("/msg").forward(request, response);
		} catch (Exception e) {
			String mString = "{msg:'网络状况不佳!',	userinfo:{},result: 0}";
			request.setAttribute("msg", mString);
			request.getRequestDispatcher("/msg").forward(request, response);
		}
	}

}
