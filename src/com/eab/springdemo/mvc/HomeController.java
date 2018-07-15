package com.eab.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	// define a controller method
	public String showPage() {
		return "main-menu";
	}

}
