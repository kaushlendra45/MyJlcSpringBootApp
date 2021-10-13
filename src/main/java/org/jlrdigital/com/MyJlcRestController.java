package org.jlrdigital.com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyJlcRestController {

	@GetMapping("/getsms")
	public String getMsg() {
		return "Welcome to JLC Spring-APP---Wow Its Running.......";
	}
	
	
}
