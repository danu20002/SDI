package com.danunaik.spr1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@Qualifier("thisone")
public class MysqlDatservices implements DataServices {

	@Override
	public int[] retrivedata() {
		// TODO Auto-generated method stub
		return new int[] {1,2,3,4,5};
	}

}
