package cn.itcast.core.service;

import cn.itcast.core.bean.Customer;
import cn.itcast.core.bean.QueryVo;
import cn.itcast.core.utils.Page;

public interface CumtomerService {
	Page<Customer> getCustomerList(QueryVo queryVo);
	Customer getCustomerById(Long id);
	void updateCustomer(Customer customer);
	void deleteCustomer(Long id);
 
}
