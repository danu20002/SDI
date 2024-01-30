package com.danunaik.spr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App01GamingBasic {

	public static void main(String[] args) {
		var game=new PacMan();
		// var game=new  MarioGame();
		 var gamerunner=new  GameRunner(game);
		 System.out.println(gamerunner);
		gamerunner.run();
	}

}
