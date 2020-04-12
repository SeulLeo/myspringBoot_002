package com.zk.myspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {	
	@RequestMapping("/demo")
	public String home() {
		return "Hello,world";
	}	
}
