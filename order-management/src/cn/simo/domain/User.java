package cn.simo.domain;

/**
 * 用户类
 * @author liuliwei
 * 
 */
public class User {
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
	private String phone;
	private int id;
	private String fullname;
	private String openid;
	private String avatorUrl;
	private String password;
	private int identity;
	private int status;
	
	public User() {
		this.setStatus(0);
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public String getAvatorUrl() {
		return avatorUrl;
	}
	public void setAvatorUrl(String avatorUrl) {
		this.avatorUrl = avatorUrl;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getIdentity() {
		return identity;
	}
	public void setIdentity(int identity) {
		this.identity = identity;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
}
