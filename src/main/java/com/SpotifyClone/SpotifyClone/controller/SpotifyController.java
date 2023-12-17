package com.SpotifyClone.SpotifyClone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpotifyController {
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/song_register")
	public String songRegister() {
		return "songRegister";
	}
		
	@GetMapping("/available_songs")
	public String getAllSongs() {
		return "songsList";
	}
	

}
