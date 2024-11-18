package com.aniandjava.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloAnika {
	
	@GetMapping("/anika")
	public String anika() {
		return "Hello Anika You'r welcome to spring boot";
	}

}
