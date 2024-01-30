package com.danunaik.spr1;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
@ComponentScan("com.danunaik.spr1")
@Configuration
public class BusinessCalculationService {
	
	DataServices dataServices;
	public BusinessCalculationService( @Qualifier("thisone") DataServices dataServices) {
		this.dataServices=dataServices;
	}
	
 public int finmax() {
	return Arrays.stream(dataServices.retrivedata()).max().orElse(0);
}
	
	
	public static void main(String[] args) {

		var  context=new AnnotationConfigApplicationContext(BusinessCalculationService.class);
		System.out.println(context.getBean(BusinessCalculationService.class).finmax());
		}

}
