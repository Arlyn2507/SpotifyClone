package com.SpotifyClone.SpotifyClone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpotifyClone.SpotifyClone.entity.Song;
import com.SpotifyClone.SpotifyClone.repository.SongRepository;

@Service
public class SongService {
	
	@Autowired
	private SongRepository songRepo;
	public void save(Song s) {
		songRepo.save(s);
	}
	
	public List<Song> getAllSong(){
		return songRepo.findAll();
	}
}
