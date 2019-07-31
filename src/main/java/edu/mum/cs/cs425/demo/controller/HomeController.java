package edu.mum.cs.cs425.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

//	@RequestMapping(value = "/demo", method = RequestMethod.GET)
	@GetMapping(value = {"/demo", "/demo/home"})
	public String displayHomepage() {
		return "home/index";
	}

	@GetMapping(value = {"/demo/about"})
	public String displayAboutPage() {
		return "home/about";
	}
}
