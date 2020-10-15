package cn.itcast.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.core.bean.Customer;
import cn.itcast.core.bean.QueryVo;
import cn.itcast.core.dao.CustomerDao;
import cn.itcast.core.service.CumtomerService;
import cn.itcast.core.utils.Page;
@Service
public class CustomerServiceImpl implements CumtomerService {

	
	@Autowired
	private CustomerDao customerDao;
	
	@Override
	public Page<Customer> getCustomerList(QueryVo queryVo) {
		//计算分页的起始记录
		if(queryVo.getPage() != null) {
			queryVo.setStart((queryVo.getPage() - 1) * queryVo.getSize());
		}
		List<Customer> customerList = customerDao.getCustomerList(queryVo);
		//创建一个page对象
		Page<Customer> page = new Page<>();
		page.setRows(customerList);
		//查询总记录数
		Integer count = customerDao.getCustomerCount(queryVo);
		page.setTotal(count);
		page.setSize(queryVo.getSize());
		page.setPage(queryVo.getPage());
	
		return page;
	}

	@Override
	public Customer getCustomerById(Long id) {
		// TODO Auto-generated method stub
		Customer customerById = customerDao.getCustomerById(id);
		return customerById;
	}

	@Override
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.updateCustomer(customer);
	}

	@Override
	public void deleteCustomer(Long id) {
		// TODO Auto-generated method stub
		customerDao.deleteCustomer(id);
		
	}

	 

}
