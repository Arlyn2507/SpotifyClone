package com.SpotifyClone.SpotifyClone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpotifyClone.SpotifyClone.entity.MySongList;

@Repository
public interface MySongRepository extends JpaRepository<MySongList, Integer> {

}
