package com.SpotifyClone.SpotifyClone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.SpotifyClone.SpotifyClone.entity.MySongList;
import com.SpotifyClone.SpotifyClone.entity.Song;
import com.SpotifyClone.SpotifyClone.service.MySongListService;
import com.SpotifyClone.SpotifyClone.service.SongService;

@Controller
public class SpotifyController {
	
	@Autowired
	private SongService service;
	
	@Autowired
	private MySongListService mySongService;
	
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
	public String getMySongs(Model model) {
		List<MySongList> list = mySongService.getAllMySongs();
		model.addAttribute("song", list);
		return "mySongs";
	}
	
	@RequestMapping("/my_list/{id}")
	public String getMyList(@PathVariable("id") int id) {
		Song s = service.getSongById(id);
		MySongList mySongList = new MySongList(s.getId(), s.getName(), s.getArtist(), s.getArtist());
		mySongService.saveMySong(mySongList);
		return "redirect:/my_songs";
	}
	
	@RequestMapping("/editSong/{id}")
	public String editSong(@PathVariable("id") int id, Model model) {
		Song s = service.getSongById(id);
		model.addAttribute("song", s);
		return "songEdit";
	}
	
	@RequestMapping("/deleteBook/{id}")
	public String deleteSong(@PathVariable("id") int id) {
		service.deleteSongById(id);
		return "redirect:/available_songs";
	}
	
}
