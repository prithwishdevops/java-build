package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired
	HelloProperties props;	
	
	@RequestMapping(value="/hello",produces = "application/json")
	@ResponseBody
	public String hello(@RequestParam String name) {
		return props.getGreeting()+name;
	}	
	
	
}
