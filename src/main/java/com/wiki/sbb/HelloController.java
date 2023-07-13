package com.wiki.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@GetMapping("/hello2")
	@ResponseBody
	public String hello() {
		return "hello 111222";
	}

}
