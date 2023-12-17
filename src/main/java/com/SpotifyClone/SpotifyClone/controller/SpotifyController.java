package com.SpotifyClone.SpotifyClone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.SpotifyClone.SpotifyClone.entity.Song;
import com.SpotifyClone.SpotifyClone.service.SongService;

@Controller
public class SpotifyController {
	
	@Autowired
	private SongService service;
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/song_register")
	public String songRegister() {
		return "songRegister";
	}
	
	@GetMapping("/available_songs")
	public ModelAndView getAllSong() {
		List<Song> list = service.getAllSong();
		return new ModelAndView("songsList","song",list);
	}
	
	@PostMapping("/save")
	public String addSong(@ModelAttribute Song s) {
		service.save(s);
		return "redirect:/available_songs";
	}
	
	@GetMapping("/my_songs")
	public String getMySongs() {
		return "mySongs";
	}

}
