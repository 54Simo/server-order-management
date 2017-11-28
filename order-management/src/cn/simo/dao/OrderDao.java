package cn.simo.dao;

import java.sql.SQLException;
import java.sql.Timestamp;

import org.apache.commons.dbutils.QueryRunner;

import cn.simo.utils.DataSourceUtils;
import cn.simo.domain.Order;

/**
 * 订单数据访问类
 * @author zhangheng
 *
 */
public class OrderDao {
	/**
	 * 添加订单
	 * @param oder   订单
	 * @return 0: fail  1: success
	 * @throws SQLException 
	 */
	public int addOrder(Order order) throws SQLException{
		QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "INSERT INTO `orderinfo` VALUES (?,?,?,?,?,?,?, ?, ?);";
		System.out.println("hahahaha"+new Timestamp(order.getCreatedDate().getTime()));
		Object[] params = {order.getId(),new Timestamp(order.getCreatedDate().getTime()),order.getProject(),order.getComment(),order.getCompany(),order.getAddrss(),order.getContact(),order.getOwnerPhone(),order.getStatus()};
		return qr.update(sql, params);
	}

}
