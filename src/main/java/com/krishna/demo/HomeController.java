package com.krishna.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class HomeController {

	@RequestMapping("home")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("home");
		return mv;
	}
	
	@RequestMapping("/")
	public ModelAndView Default() {
		ModelAndView mv = new ModelAndView("home");
		return mv;
	}
	
	@GetMapping("/home1")
	public String home1() {
		return "home1";
	}
	
}
