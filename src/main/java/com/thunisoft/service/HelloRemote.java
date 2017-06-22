package com.thunisoft.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.thunisoft.hystrix.HelloHystrix;
@FeignClient(value = "service-one",fallback=HelloHystrix.class)
public interface HelloRemote {
	@RequestMapping(value = "/hello")
	public String Hello();
}
