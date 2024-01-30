package com.danunaik.spr;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
class yourbusiness{
	
	Dependency1 dependency1;
	
	Dependency2 dependency2;
    @Autowired
	public yourbusiness(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}
	
//	public Dependency1 getDependency1() {
//		return dependency1;
//	}
//	
//	@Autowired
//	public void setDependency1(Dependency1 dependency1) {
//		this.dependency1 = dependency1;
//	}
//	
//	public Dependency2 getDependency2() {
//		return dependency2;
//	}
//	
//	@Autowired
//	public void setDependency2(Dependency2 dependency2) {
//		this.dependency2 = dependency2;
//	}
//	
	public String tostring() {
		return "using"+dependency1 +"and"+dependency2;
		
	}
}
@Component
class Dependency1{
	
}
@Component
class Dependency2{
	
}



@Configuration
@ComponentScan("com.danunaik.spr")
public class App03GamingBasics {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      var context=new  AnnotationConfigApplicationContext(App03GamingBasics.class);
      context.getBean(GamingConsole.class).up();
      context.getBean(GameRunner.class).run();
      System.out.println(context.getBean(yourbusiness.class).tostring());
      
    //Arrays.stream(context.getBeanDefinitionNames()).forEach (System.out::println);
     
	}

}
