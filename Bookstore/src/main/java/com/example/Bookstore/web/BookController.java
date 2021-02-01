package com.example.Bookstore.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

public class BookController {

	@Controller
	@ResponseBody
	public class HelloController {
		@RequestMapping("/index")
		public String hello() {
			return "Hello Spring";
	    }
	}
}
