package com.example.validate_song_information.service;

import com.example.validate_song_information.model.Song;
import com.example.validate_song_information.repository.ISongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService implements ISongService {
    @Autowired
    private ISongRepository iSongRepository;

    @Override
    public List<Song> findAll() {
        return iSongRepository.findAll();
    }

    @Override
    public void add(Song song) {
        iSongRepository.save(song);
    }

    @Override
    public Song findById(int id) {
        return iSongRepository.findById(id).orElse(null);
    }

    @Override
    public void update(int id, Song song) {
        Song songToUpdate = iSongRepository.findById(id).orElse(null);
        if (songToUpdate != null) {
            songToUpdate.setNameSong(song.getNameSong());
            songToUpdate.setArtist(song.getArtist());
            songToUpdate.setCategory(song.getCategory());

            iSongRepository.save(songToUpdate);
        }
    }

    @Override
    public void delete(int id) {
        iSongRepository.deleteById(id);
    }
}
