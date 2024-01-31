package com.danunaik.spr2.a1;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXmlConfiguration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    var  context=new ClassPathXmlApplicationContext("config.xml");
    Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    System.out.println(context.getBean("name"));
    
    }

}
