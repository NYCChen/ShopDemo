package com.itheima.domain;

/** 

* @author ： nyc 

* @version 创建时间：2019年9月26日 下午3:56:24 

* 类说明 ：购物车内 单个物品的对象

*/

public class CartItem {
	
	private Product product;
	private int buyNum;
	private double subtotal;
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getBuyNum() {
		return buyNum;
	}
	public void setBuyNum(int buyNum) {
		this.buyNum = buyNum;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}


}
