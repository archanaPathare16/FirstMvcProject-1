package com.springBoot.firstMvcProject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	public WelcomeController() {
		super();

		System.out.println("Welcome Class Controller");
	
	}
@GetMapping("/WelcomeMSG")
	public ModelAndView welcomeMSG (){
		
		String msg = "Welcome to India";
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("MASSAGE",msg);
		mav.setViewName("Welcome");
		
		return mav;
		
	}


	
}
