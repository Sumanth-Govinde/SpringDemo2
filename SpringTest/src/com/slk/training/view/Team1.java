package com.slk.training.view;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.slk.training.beans.Car;

public class Team1 {
	public static void main(String args[]){
		
		//IOC Container
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Car c1=(Car)context.getBean("c1");
		c1.started1();
		System.out.println(c1);
	}

}
