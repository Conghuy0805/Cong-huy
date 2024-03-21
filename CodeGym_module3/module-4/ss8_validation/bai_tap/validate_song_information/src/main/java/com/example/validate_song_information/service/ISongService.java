package com.example.validate_song_information.service;

import com.example.validate_song_information.model.Song;

import java.util.List;

public interface ISongService {
    List<Song> findAll();
    void add(Song song);
    Song findById(int id);
    void update(int id, Song song);
    void delete(int id);
}
