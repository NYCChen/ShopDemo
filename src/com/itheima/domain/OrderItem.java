package com.itheima.domain;

/** 

* @author ： nyc 

* @version 创建时间：2019年9月27日 下午8:04:04 

* 类说明 ：

*/

public class OrderItem {
	
	private String itemid;//订单项的id
	private int count;//订单项内商品的购买数量
	private double subtotal;//订单项小计
	private Product product;//订单内部商品
	private Order order;//该订单项属于哪个订单
	
	
	public String getItemid() {
		return itemid;
	}
	public void setItemid(String itemid) {
		this.itemid = itemid;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
	
}
