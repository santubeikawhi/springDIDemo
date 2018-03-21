package com.jl.spring.helper;

import com.jl.spring.bean.Customer;
import com.jl.spring.dao.PersonDao;

/**   
* @Title: CustomerHelper.java spring����ע�루DI��
* @Package com.jl.spring.webapp 
* @Description: TODO
* @author jiangl  
* @date 2018��3��21�� ����9:03:29 
* @version V1.0   
*/
public class PersonHelper {
	private Customer customer;
	private PersonDao personDao;//ͨ���ӿ���ʵ��ע��
	private PersonDao personDao2;
	
	/*ͨ�����캯���ķ�ʽ����ע��*/
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
	/*ͨ��setter��������ע��*/
	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	} 
}
