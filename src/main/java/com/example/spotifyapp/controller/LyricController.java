package com.example.spotifyapp.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class LyricController {

     @GetMapping(path = "/lyrics/")
    public String getLyrics() {
            return "get all lyrics";
    }

    @GetMapping(path = "/lyrics/{lyricId}")
    public String getFavoriteSongs(@PathVariable Long lyricId) {
        return "getting the lyric with the id of " + lyricId;
    }

    @PostMapping("/lyrics/")
    public String createLyrics(@RequestBody String body) {
        return "creating a lyrics " + body;
    }

    @PutMapping("/lyrics/{lyricId}")
    public String updateLyrics(@PathVariable(value = "lyricId") Long lyricId, @RequestBody String body) {
        return "updating the song with the id of " + lyricId + body;
    }

    @DeleteMapping("/favoriteSongs/{favoriteFongId}")
    public String deleteFavoriteSongs(@PathVariable(value = "favoriteSongId") Long favoriteSongId) {
        return "deleting the favoriteSong with the id of " + favoriteSongId;
    }
}
