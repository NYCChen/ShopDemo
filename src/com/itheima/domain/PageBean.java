package com.itheima.domain;

import java.util.List;

/** 

* @author ： nyc 

* @version 创建时间：2019年9月24日 下午8:01:35 

* 类说明 ：

*/

public class PageBean<T> {
	
	private int currentPage;//当前页
	private int currentCount;//当前页显示条数
	private int totalCount;//总条数
	private int totalPage;//总页数
	private List<T> list;//当前页现实的数据
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getCurrentCount() {
		return currentCount;
	}
	public void setCurrentCount(int currentCount) {
		this.currentCount = currentCount;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	
	

}
