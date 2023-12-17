package com.webapp.SpotifyClone.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Song {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String artist;
	private String album;
	public Song(int id, String name, String artist, String album) {
		super();
		this.id = id;
		this.name = name;
		this.artist = artist;
		this.album = album;
	}
	
	public Song() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public String getALbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	

}
