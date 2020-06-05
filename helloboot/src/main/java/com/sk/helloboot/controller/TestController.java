package com.sk.helloboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@RequestMapping(method = RequestMethod.GET, value="/")
	public String hello() {
		return "Hello, World!";
	}
}