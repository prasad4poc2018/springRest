package com.tulasiprasad.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping (path="/callMe")
	public String callMe() {
		return "success";
	}
}
