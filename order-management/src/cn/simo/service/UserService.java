package cn.simo.service;

import java.sql.SQLException;

import cn.simo.dao.UserDao;
import cn.simo.domain.User;

/**
 * 用户服务类
 * @author liuliwei
 *
 */
public class UserService {

	/**
	 * 用户注册
	 * @param user 用户
	 * @return 注册结果
	 * @throws SQLException 
	 */
	public int register(User user) throws SQLException {
		UserDao dao = new UserDao();
		return dao.addUser(user);
	}
	
	/**
	 * 用户登陆
	 * @param phone 手机号
	 * @param password 密码
	 * @return User 用户
	 * @throws SQLException 
	 */
	public User login(String phone, String password) throws SQLException {
		UserDao dao = new UserDao();
		return dao.getUserByPhoneAndPassword(phone,password);
	}
}
