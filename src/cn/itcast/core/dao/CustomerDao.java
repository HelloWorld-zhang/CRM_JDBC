package cn.itcast.core.dao;

import java.util.List;

import cn.itcast.core.bean.Customer;
import cn.itcast.core.bean.QueryVo;

public interface CustomerDao {
	List<Customer> getCustomerList(QueryVo queryVo);
	Integer getCustomerCount(QueryVo queryVo);
	Customer getCustomerById(Long id);
	void updateCustomer(Customer customer);
	void deleteCustomer(Long id);
}
