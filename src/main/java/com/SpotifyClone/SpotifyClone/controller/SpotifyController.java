package com.SpotifyClone.SpotifyClone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpotifyController {
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/page1")
	public String page1() {
		return "page1";
	}
		
	
	

}
