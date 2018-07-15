package com.eab.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		// add student object as model attribute
		theModel.addAttribute("student", new Student());
		return "student-form";
	}

	@RequestMapping("/process-form")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		// System.out.println(theStudent.getFirstName() + "\n" +
		// theStudent.getLastName());

		return "student-confirmation";

	}

}
