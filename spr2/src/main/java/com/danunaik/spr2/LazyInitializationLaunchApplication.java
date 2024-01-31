package com.danunaik.spr2;




import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass{
	private SomeDependency  someDependency;
	public SomeClass(SomeDependency  someDependency) {
		 
		this.someDependency=someDependency;
		System.out.println("all dependencies are  ready");
	}
	@PostConstruct
	public void Initialize() {
		someDependency.getReady();
	}
	@PreDestroy
	public void cleanup() {
		System.out.println("Cleanedup");
	}
}
@Component
class SomeDependency{
	public void  getReady() {
		System.out.println("some thing is going on here  the logic");
		
	}
}

@Configuration
@ComponentScan
public class LazyInitializationLaunchApplication {

	public static void main(String[] args) {
		var context=new AnnotationConfigApplicationContext(LazyInitializationLaunchApplication.class);
		//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}

}
