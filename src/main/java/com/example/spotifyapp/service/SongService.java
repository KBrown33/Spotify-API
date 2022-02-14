package com.example.spotifyapp.service;

import com.example.spotifyapp.model.Artist;
import com.example.spotifyapp.model.Song;
import com.example.spotifyapp.repository.AlbumRepository;
import com.example.spotifyapp.repository.ArtistRepository;
import com.example.spotifyapp.repository.LyricRepository;
import com.example.spotifyapp.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class SongService{

    @Autowired
    public void setSongRepository(SongRepository songRepository) {
        this.songRepository = songRepository;

    }

    private SongRepository songRepository;


//    private AlbumRepository albumRepository;
//
//    private ArtistRepository artistRepository;
//
//    private LyricRepository lyricRepository;

    public List<Song> getAllSongs() {
        List<Song> song = songRepository.findAll();
        return song;

    }

    public Song getSongs(@PathVariable Long songId) {
        Song song =  songRepository.getById(songId);
        return  song;
    }

    public Song createSongs(@RequestBody Song body) {

        return songRepository.save(body);
    }

//    public Song updateSongs(@PathVariable(value = "songId") Long songId, @RequestBody Song body) {
//        Song song = songRepository.getById(songId);
//        artist.setName(body.getName());
//        return artistRepository.save(artist);
//    }
//
    public String deleteSongs(@PathVariable(value = "songId") Long songId) {
        songRepository.deleteById(songId);
        return "deleted Song " + songId;
    }

}




