package cn.simo.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import cn.simo.domain.User;
import cn.simo.utils.DataSourceUtils;

/**
 * 用户数据访问类
 * @author liuliwei
 *
 */
public class UserDao {
	/**
	 * 添加用户
	 * @param user 用户信息
	 * @return 注册结果
	 * @throws SQLException 
	 */
	public int addUser(User user) throws SQLException {
		// 使用了 dbutils 工具 和 c3p0数据库连接池
		QueryRunner qRunner = new QueryRunner(DataSourceUtils.getDataSource());
		/**
	 	  `phone` char(11) 
		  `id` int(11) 
		  `fullname` char(10)
		  `openid` char(28)
		  `avatorUrl` varchar(100)
		  `password` char(18 
		  `identity` int(11) 
		  `status` int(11) 
	  */
		String sql = "insert into userinfo(phone,id,fullname,password,identity,status) values (?,?,?,?,?,?)";
		System.out.println(user.getFullname());
		return qRunner.update(sql, user.getPhone(), user.getId(), user.getFullname(),
				user.getPassword(), user.getIdentity(), user.getStatus());
	}
	
	/**
	 * 通过手机号和密码获得用户
	 * @param phone 手机号
	 * @param password 密码
	 * @return User 用户
	 * @throws SQLException 
	 */
	public User getUserByPhoneAndPassword(String phone, String password) throws SQLException {
		QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
		
		String sql = "select * from userinfo where phone = ? and password = ?";
		
		return qr.query(sql, new BeanHandler<>(User.class), phone, password);
	}
}
