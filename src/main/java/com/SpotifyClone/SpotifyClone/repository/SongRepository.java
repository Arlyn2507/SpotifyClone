package com.SpotifyClone.SpotifyClone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpotifyClone.SpotifyClone.entity.Song;

@Repository
public interface SongRepository extends JpaRepository<Song, Integer>{

}
