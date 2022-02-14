package com.example.spotifyapp.controller;


import com.example.spotifyapp.model.Album;
import com.example.spotifyapp.model.Lyric;
import com.example.spotifyapp.service.AlbumService;
import com.example.spotifyapp.service.LyricService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class LyricController {


    private LyricService lyricService;
    @Autowired
    public void setLyricService(LyricService lyricService) {
        this.lyricService = lyricService;
    }

     @GetMapping(path = "/lyrics/")
     public List<Lyric> getAllLyrics() {
         return  lyricService.getAllLyrics();
     }

    @GetMapping(path = "/lyrics/{lyricId}")
    public Lyric getLyrics(@PathVariable Long lyricId) {
        return lyricService.getLyrics(lyricId);
    }

    @PostMapping("/lyrics/")
    public Lyric createLyrics(@RequestBody Lyric body) {
        return lyricService.createLyrics(body);
    }

    @PutMapping("/lyrics/{lyricId}")
    public Lyric updateLyrics(@PathVariable(value = "lyricId") Long lyricId, @RequestBody Lyric body) {
        return lyricService.updateLyrics(lyricId, body);
    }

    @DeleteMapping("/lyrics/{lyricId}")
    public String deleteLyrics(@PathVariable(value = "lyricId") Long lyricId) {
        return lyricService .deleteLyrics(lyricId);
    }
}
