package com.danunaik.spr;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole {

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("Jump");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("sit");
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("move left");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("move right");
	}

}
