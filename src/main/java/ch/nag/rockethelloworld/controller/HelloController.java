package ch.nag.rockethelloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String index() {
        // just a comment to check it bla
		return "Greetings from Rocket!";
	}
	
	// --> Übung 2 
	// @GetMapping("/bye")
	// public String bye() {
    //     // just a comment to check it bla
	// 	return "ByeBye!";
	// }

}