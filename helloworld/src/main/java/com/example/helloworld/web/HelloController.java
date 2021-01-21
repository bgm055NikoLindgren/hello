package com.example.helloworld.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController {
	@RequestMapping("/hello")
	public String hello(@RequestParam(name = "firstname") String firstName,
			@RequestParam(name = "location") String location) {
		return "Hello " + firstName + " From " + location;
	}
}

// https://github.com/bgm055NikoLindgren