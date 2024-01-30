package com.danunaik.spr;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PacManGamequalifier")
public class PacMan implements GamingConsole {

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("pacman Up");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("pacman down");
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("pacman left");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("pacman right");
	}

}
