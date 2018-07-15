package com.eab.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	// need a controller method to show the initial HTML form
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	// need a controller method to process HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloWorld";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String setStudentName(HttpServletRequest request, Model model) {
		String name = request.getParameter("studentName");
		name = name.toUpperCase();
		String result = "Hey, " + name;
		model.addAttribute("message", result);
		return "helloWorld";
	}
	
	@RequestMapping("/processFormv3")
	public String letsShoutDude(
			@RequestParam("studentName") String theName, Model model) {
		
		theName = theName.toUpperCase();
		String result = "Hey bro, from @RequestParam " + theName;
		model.addAttribute("message", result);
		
		return "helloWorld";
	}

}
