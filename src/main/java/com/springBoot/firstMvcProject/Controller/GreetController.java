package com.springBoot.firstMvcProject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetController {

	@GetMapping("/Greet")
	public String greetMsg(Model model) {
		
		String greetMsg="Good Morning";
		model.addAttribute("GREETMSG",greetMsg);
		
		return "greet";
		
	}
}
