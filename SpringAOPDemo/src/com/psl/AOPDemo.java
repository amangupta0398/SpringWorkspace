package com.psl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class AOPDemo {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("AOP.xml");
		Performer p=(Performer)context.getBean("perform");
		try{
		p.perform();
		}catch(Exception e){
			System.out.println("Rain Rain");
		}
	//	Audience a=context.getBean("audience", Audience.class);
		
	}
}
