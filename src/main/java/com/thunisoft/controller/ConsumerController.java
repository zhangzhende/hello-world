package com.thunisoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thunisoft.service.HelloRemote;

@RestController
public class ConsumerController {
	@Autowired
	HelloRemote helloRemote;
	
	@RequestMapping("/hello/gethello")
	public String getHello(){
		return helloRemote.Hello();
	}
}
