package com.danunaik.spr.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Adress (String city,String country) {};

record Person(String name,int age,Adress adress) {};// creates  constructor ,getter,setter
@Configuration
public class HelloWorldconfigration {
    @Bean
	public String  name() {
		return "Danesh";
		
	}
    @Bean
    public int age() {
		return 20;
	}
    @Bean
 
   public Person person() {
	var person=new Person("Ravi", 20, new Adress("mudalagi","gg"));
	return person;
}
    @Bean
    
    public Person person3parameter() {
 	var person=new Person(name(), age(), adress2());
 	return person;
 }
    
@Bean(name="adress2")
public Adress adress2() {
	var  adress=new Adress("Belagavi", "India");
	return adress;
	
}
@Bean(name="adress3")
@Primary
public Adress adress() {
	var  adress=new Adress("Belagavi", "India");
	return adress;
	
}

@Bean
@Qualifier("person2")
public Person  person2() {
	var  person2=new Person("Tushar", 22,adress2());
	return person2;
			
}
}
