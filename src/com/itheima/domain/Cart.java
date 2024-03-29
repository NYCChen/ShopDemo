package com.itheima.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** 

* @author ： nyc 

* @version 创建时间：2019年9月26日 下午3:58:55 

* 类说明 ：整个购物车对象

*/

public class Cart {

	//购物车内存的 n 个购物项
	private Map<String, CartItem> cartItems = new HashMap<String, CartItem>();
	
	//商品的总计
	private double total;

	public Map<String, CartItem> getCartItems() {
		return cartItems;
	}

	public void setCartItems(Map<String, CartItem> cartItems) {
		this.cartItems = cartItems;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
}
