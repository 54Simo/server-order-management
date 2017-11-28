package cn.simo.domain;

import java.util.Date;

/**
 * 订单信息类
 * @author zhangheng
 *
 */
public class Order {
	private String id;
	private Date createdDate;
	private String project;
	private String comment;
	private String company;
	private String addrss;
	private String contact;
	private String ownerPhone;
	private int status;
	
	public Order() {
		/*
		 * 初始化一些数据
		 */
		this.setCreatedDate(new Date());
		this.setStatus(0);
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date date) {
		this.createdDate = date;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getAddrss() {
		return addrss;
	}
	public void setAddrss(String addrss) {
		this.addrss = addrss;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getOwnerPhone() {
		return ownerPhone;
	}
	public void setOwnerPhone(String ownerPhone) {
		this.ownerPhone = ownerPhone;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
}
