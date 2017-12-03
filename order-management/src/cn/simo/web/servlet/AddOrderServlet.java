package cn.simo.web.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import cn.simo.domain.Order;
import cn.simo.service.OrderService;
import cn.simo.utils.Utils;

/**
 * 添加订单Servlet
 * @author zhangheng
 *
 */
public class AddOrderServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			Order order = new Order();
			BeanUtils.populate(order, request.getParameterMap());
			order.setId(Utils.generateOrderId(order.getOwnerPhone()));
			int i = new OrderService().addOrder(order);
			if (i == 1) {
				String mString = "{\"msg\":\"添加成功!\",\"result\":1}";
				request.setAttribute("msg", mString);
			} else {
				String mString = "{\"msg\":\"添加失败!\",\"result\":0}";
				request.setAttribute("msg", mString);
			}
		} catch (Exception e) {
			String mString = "{\"msg\":\"网络状况不佳!\",\"result\": 0}";
			request.setAttribute("msg", mString);
			request.getRequestDispatcher("/msg").forward(request, response);
		}
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}

}
