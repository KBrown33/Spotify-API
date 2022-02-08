package com.example.spotifyapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")

public class SongController {
     @GetMapping(path = "/songs/")
    public String getSongs() {
            return "get all songs";
    }

    @GetMapping(path = "/songs/{songId}")
    public String getSongs(@PathVariable Long songId) {
        return "getting the song with the id of " + songId;
    }

    @PostMapping("/songs/")
    public String createSongs(@RequestBody String body) {
        return "creating a songs " + body;
    }

    @PutMapping("/songs/{songId}")
    public String updateSongs(@PathVariable(value = "songId") Long songId, @RequestBody String body) {
        return "updating the song with the id of " + songId + body;
    }

    @DeleteMapping("/songs/{songId}")
    public String deleteSongs(@PathVariable(value = "songId") Long songId) {
        return "deleting the song with the id of " + songId;
    }
}
