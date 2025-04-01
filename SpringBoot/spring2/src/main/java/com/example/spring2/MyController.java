package com.example.spring2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	@RequestMapping("/hi")
	public String call() {
		System.out.println("Testing !!");
		return "index.html";
	}

}
