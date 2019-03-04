package com.psl.demo;

public class Client {

	public static void main(String[] args) {
	
		Performance p=new Performance(new Dancer());
		Performance p1=new Performance(new Singer());
		Performance p2=new Performance(new Painter());
		
		
		
		p.perform();
		p1.perform();
		p2.perform();

	}

}
