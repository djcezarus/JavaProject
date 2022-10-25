package com.cohart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index() {
		System.out.println("inside index()");
		return "index";
	}

	@RequestMapping("/registrationPage")
	public String registration() {

		return "registrationPage";
	}

	@RequestMapping("/home")
	public String homepage() {
		return "welcomePage";
	}
	
}