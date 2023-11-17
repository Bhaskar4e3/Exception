package com.example.stock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetCont {
	@Autowired
	private Environment env;
   @RequestMapping(value = "/greet/")
	public String say() {
		return "hello"+" "+env.getProperty("local.server.port");
		
	}
}
