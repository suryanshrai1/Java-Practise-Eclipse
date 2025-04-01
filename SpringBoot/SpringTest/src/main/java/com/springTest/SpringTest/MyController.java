package com.springTest.SpringTest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class MyController {
	@RequestMapping("/test")
	
	public String call() {
		
		System.out.println("Testing !!");
		return "test";
	}

}
