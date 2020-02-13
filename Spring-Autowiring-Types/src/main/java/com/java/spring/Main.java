package com.java.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {


		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		/*Person person=(Person) context.getBean("person");

		System.out.println(person);*/


		Employee employee=(Employee) context.getBean("employee");

		System.out.println(employee.getName());

	}

}
