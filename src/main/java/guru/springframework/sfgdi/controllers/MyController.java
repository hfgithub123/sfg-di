package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingService;

@Controller
public class MyController {
	
	public MyController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}

	private GreetingService greetingService;

	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
