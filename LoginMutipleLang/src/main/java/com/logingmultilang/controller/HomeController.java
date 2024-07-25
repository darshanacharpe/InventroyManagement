package com.logingmultilang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ch.qos.logback.core.model.Model;

@Controller
public class HomeController {
//
//	@GetMapping("/")
//	public String home() {
//	return "login";
//	}
//	
//	
	@GetMapping("/change-language")
    public String changeLanguage(@RequestParam("lang") String lang, Model model) {
        // Additional logic to handle language change if needed
        return "redirect:/?lang=" + lang;
    }


}