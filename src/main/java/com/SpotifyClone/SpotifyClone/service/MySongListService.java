package com.SpotifyClone.SpotifyClone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpotifyClone.SpotifyClone.entity.MySongList;
import com.SpotifyClone.SpotifyClone.repository.MySongRepository;

@Service
public class MySongListService {

	@Autowired
	private MySongRepository mySong;
	
	public void saveMySong(MySongList songList) {
		mySong.save(songList);
	}
	
	public List<MySongList> getAllMySongs(){
		return mySong.findAll();
	}
	
	public void deleteById(int id) {
		mySong.deleteById(id);
	}
}
