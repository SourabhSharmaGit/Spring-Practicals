package com.rays.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMultipleXML {

	public static void main(String[] args) {

	ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"UserBean.xml","Person.xml"});
	
	UserBean bean = (UserBean) context.getBean("User");
	System.out.println("Test UserBean");
	System.out.println("Login = "+bean.getLogin());
	System.out.println("Password = "+bean.getPassword());
	
	Person person = (Person) context.getBean("Person");
	System.out.println("Test Person");
	System.out.println("Person's name = "+person.getName());
	}

}
