package com.SpotifyClone.SpotifyClone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SpotifyClone.SpotifyClone.service.MySongListService;

@Controller
public class MySongListController {
	
	@Autowired
	private MySongListService service;

	@RequestMapping("/deleteMyList/{id}")
	public String deleteMyList(@PathVariable("id") int id) {
		service.deleteById(id);
		return "redirect:/my_songs";
	}
}
