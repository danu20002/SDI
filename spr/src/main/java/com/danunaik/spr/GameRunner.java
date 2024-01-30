package com.danunaik.spr;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	private GamingConsole  game;
  public GameRunner(/* @Qualifier("PacManGamequalifier")*/  GamingConsole game) {
	// TODO Auto-generated constructor stub
	  this.game=game;
}
  public void run() {
	  game.up();
	  game.down();
	  game.left();
	  game.right();
	
}
}
