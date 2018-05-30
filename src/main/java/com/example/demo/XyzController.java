package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class XyzController {
     
	@RequestMapping("xyz")
	public String count() {
		return "welcome";	
	}
}
