package com.psl.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class HelloSpring {

	public static void main(String[] args) {
		
//		Employee e=new Employee();
//		System.out.println(e);
		
		
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
	Employee e=(Employee)	context.getBean("emp");
	Employee e1=(Employee)	context.getBean("emp");
	
	System.out.println(e==e1);     //true---->just because container follow a singleton behaviour. To remove this we have to use  "scope" in config.xml
	System.out.println(e.equals(e1));    //true
	System.out.println(e.hashCode());
	System.out.println(e1.hashCode());
		System.out.println(e);
		context.registerShutdownHook();
//		context.destroy();
	}
}
