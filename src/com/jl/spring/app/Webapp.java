package com.jl.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jl.spring.helper.PersonHelper;

/**   
* @Title: Webapp.java spring依赖注入（DI）
* @Package com.jl.spring.app 
* @Description: TODO
* @author jiangl  
* @date 2018年3月21日 下午9:04:52 
* @version V1.0   
*/
public class Webapp {
	public static void main(String args[]){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-Common.xml");
		PersonHelper personHelper = (PersonHelper)applicationContext.getBean("customerHelper");
		System.out.println("name:"+personHelper.getCustomer().getName()+",age:"+personHelper.getCustomer().getAge());
		personHelper.getPersonDao().showName();
		personHelper.showName();
		personHelper.showContructName();
	}
}
