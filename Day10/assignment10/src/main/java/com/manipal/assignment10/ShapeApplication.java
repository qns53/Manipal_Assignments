package com.manipal.assignment10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class ShapeApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		Point obj=(Point)context.getBean("point1");
		System.out.println(obj);
		
		Line l= (Line)context.getBean("line");
		System.out.println(l);
		
		Triangle t =(Triangle) context.getBean("triangle");
		System.out.println(t);
	}

}
