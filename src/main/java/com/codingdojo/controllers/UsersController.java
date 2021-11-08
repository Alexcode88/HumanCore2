package com.codingdojo.controllers;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping (value= "/")
public class UsersController {
	
	@RequestMapping(value="/", method= RequestMethod.GET)
	public String helloHuman() {
		return "<h1>Hello Human!</h1>" +"<h2> Welcome to Spring Boot!</h2>";
	}
	
	@RequestMapping(value="{cualquiercosa1}", method= RequestMethod.GET)
    public String showLesson(@PathVariable("cualquiercosa1") String cualquiercosa1){
    	return "<h1> Hello </h1>" +  cualquiercosa1 + " <h2> Welcome to Spring Boot!</h2>";
    }
	
		
	

	//@RequestMapping(value="/", method=RequestMethod.GET)

}
