package com.itheima.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/** 

* @author ： nyc 

* @version 创建时间：2019年9月27日 下午8:07:28 

* 类说明 ：

*/

public class Order {
	
	private String oid;//该订单的订单号
	private Date ordertime;//下单时间
	private double total;//点单总金额
	private int state;//订单支付状态 1已支付    0未支付
	
	private String address;//收货地址
	private String name;//收货人名字
	private String telephone;//收货人电话
	
	private User user;//该订单属于哪个用户
	
	//订单中订单项
	List<OrderItem> orderItems = new ArrayList<OrderItem>();
	
	

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public Date getOrdertime() {
		return ordertime;
	}

	public void setOrdertime(Date ordertime) {
		this.ordertime = ordertime;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
