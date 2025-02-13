package com.rays.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {

	public static void main(String[] args) {

	ApplicationContext context = new ClassPathXmlApplicationContext("Person.xml");
	Person bean = (Person) context.getBean("person");
	System.out.println("Test Person = "+bean.getName());
	}

}
