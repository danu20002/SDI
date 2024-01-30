package com.danunaik.spr1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MogoDbDataService implements DataServices {

	@Override
	
	public int[] retrivedata() {
		// TODO Auto-generated method stub
		return new int[] {11,22,33,44,55};
	}

}
