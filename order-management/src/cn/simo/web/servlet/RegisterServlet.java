package cn.simo.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import cn.simo.domain.User;
import cn.simo.service.UserService;

/**
 * 用户注册Servlet
 * @author liuliwei
 *
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 0. 设置编码
		request.setCharacterEncoding("utf-8");
		System.out.println(request.getContentType());
		try {
			// 1. 封装数据
			// 使用BeanUtils封装对象
			User user = new User();
			BeanUtils.populate(user, request.getParameterMap());
			
			// 2. 调用UserService.register(user)，返回值 int
			int i = new UserService().register(user);
			
			// 3. 判断int，将信息转发到msgservlet
			if (i == 1) {
				request.setAttribute("msg", "信息已提交，等待审核！");
			} else {
				request.setAttribute("msg", "注册失败！");
			}
			// 请求转发给msgservlet
			request.getRequestDispatcher("/msg").forward(request, response);
		} catch (Exception e) {
			request.setAttribute("msg", "网络状况不佳！");
			request.getRequestDispatcher("/msg").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
