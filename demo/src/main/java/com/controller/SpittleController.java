package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.service.SpittleRepository;
import com.vo.Spitter;

@Controller
public class SpittleController {
	
	//@Autowired
	//private SpittleRepository spittleRepository;
	
	@RequestMapping(value="/{userName}",method=RequestMethod.GET)
	public String showSpitterProfile(@PathVariable String userName,Model model){
		System.out.println(userName);
		model.addAttribute("userName",userName);
		return "profile";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String showRegistrationForm(){
		return "registerForm";
	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String processRegistration(Spitter spitter){
		System.out.println(spitter.getUserName());
		System.out.println(spitter.getFirstName()+"||"+spitter.getLastName());
		return "redirect:/"+spitter.getUserName();
	}
}
