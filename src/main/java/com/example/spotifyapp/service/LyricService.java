package com.example.spotifyapp.service;

import com.example.spotifyapp.model.Artist;
import com.example.spotifyapp.model.Lyric;
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
public class LyricService {


    @Autowired
    public void setLyricRepository(LyricRepository lyricRepository) {
        this.lyricRepository = lyricRepository;

    }

    private LyricRepository lyricRepository;


//    private SongRepository songRepository;

    public List<Lyric> getAllLyrics() {
        List<Lyric> lyrics = lyricRepository.findAll();
        return lyrics;

    }

    public Lyric getLyrics(@PathVariable Long lyricId) {
        Lyric lyric=  lyricRepository.getById(lyricId);
        return  lyric;
    }

    public Lyric createLyrics(@RequestBody Lyric body) {
        return lyricRepository.save(body);
    }

    public Lyric updateLyrics(@PathVariable(value = "lyricId") Long lyricId, @RequestBody Lyric body) {
        Lyric lyric = lyricRepository.getById(lyricId);
        lyric.setText(body.getText());
        return lyricRepository.save(lyric);
    }

    public String deleteLyrics(@PathVariable(value = "lyricId") Long lyricId) {
        lyricRepository.deleteById(lyricId);
        return "deleted Lyric " + lyricId;
    }

}
