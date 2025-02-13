package com.rays.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMultipleImport {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("MultipleImport.xml");
		
		UserBean bean = (UserBean) context.getBean("User");
		Person person = (Person) context.getBean("Person");
		
		System.out.println("Test Multiple XML by Import");
		System.out.println("");
		
		System.out.println("Test UserBean");
		System.out.println("Login = "+bean.getLogin());
		System.out.println("Password = "+bean.getPassword());
		System.out.println("");
		
		System.out.println("Test Person");
		System.out.println("Person's name = "+person.getName());
	}

}
