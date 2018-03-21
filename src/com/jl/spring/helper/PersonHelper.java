package com.jl.spring.helper;

import com.jl.spring.bean.Customer;
import com.jl.spring.dao.PersonDao;

/**   
* @Title: CustomerHelper.java spring依赖注入（DI）
* @Package com.jl.spring.webapp 
* @Description: TODO
* @author jiangl  
* @date 2018年3月21日 下午9:03:29 
* @version V1.0   
*/
public class PersonHelper {
	private Customer customer;
	private PersonDao personDao;//通过接口来实现注入
	private PersonDao personDao2;
	
	/*通过构造函数的方式依赖注入*/
	public PersonHelper(PersonDao personDao2) {
		super();
		this.personDao2 = personDao2;
	}

	public void showContructName(){
		personDao2.showName();
	}
	
	public void showName(){
		personDao.showName();
	}
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public PersonDao getPersonDao() {
		return personDao;
	}
	/*通过setter方法依赖注入*/
	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	} 
}
