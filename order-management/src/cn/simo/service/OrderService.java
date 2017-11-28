package cn.simo.service;

import java.sql.SQLException;

import cn.simo.dao.OrderDao;
import cn.simo.domain.Order;
/**
 * 订单服务类
 * @author zhangheng
 *
 */
public class OrderService {
	/**
	 * 
	 * @param order
	 * @return 0: fail  1: success
	 * @throws SQLException
	 */
	public int addOrder(Order order) throws SQLException{
		OrderDao orderDao = new OrderDao();
		return orderDao.addOrder(order);
	}
}
