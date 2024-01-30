package com.danunaik.spr.helloworld;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(HelloWorldconfigration.class)) {
			System.out.println(context.getBean("name")); 
			  System.out.println(context.getBean("age"));
			  System.out.println(context.getBean("person"));
			  System.out.println(context.getBean("adress2"));
			  System.out.println(context.getBean(Person.class));
			  System.out.println(context.getBean(Adress.class));
			 // Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			  
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          
	}

}
