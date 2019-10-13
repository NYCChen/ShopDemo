package com.itheima.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.itheima.dao.AdminDao;
import com.itheima.domain.Category;
import com.itheima.domain.Order;
import com.itheima.domain.Product;

/** 

* @author ： nyc 

* @version 创建时间：2019年10月1日 下午4:36:31 

* 类说明 ：

*/

public interface AdminService {

	public List<Category> findAllCategory();

	public void saveProduct(Product product) throws SQLException ;

	public List<Order> findAllOrders();

	public List<Map<String, Object>> findOrderInfoByOid(String oid);

}
