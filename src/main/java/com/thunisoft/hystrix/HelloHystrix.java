package com.thunisoft.hystrix;

import org.springframework.stereotype.Component;

import com.thunisoft.service.HelloRemote;
@Component
public class HelloHystrix implements HelloRemote {

	@Override
	public String Hello() {
		return "sorry , your hello get failed!";
	}

}
