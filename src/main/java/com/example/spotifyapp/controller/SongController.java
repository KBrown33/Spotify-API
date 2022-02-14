//package com.example.spotifyapp.controller;
//
//import com.example.spotifyapp.model.Song;
//import com.example.spotifyapp.service.AlbumService;
//import com.example.spotifyapp.service.SongService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping(path = "/api")
//
//public class SongController {
//
//
//    private SongService songService;
//    @Autowired
//    public void setSongService(SongService songService) {
//        this.songService = songService;
//    }
//
//    @GetMapping(path = "/songs/")
//    public List<Song> getAllSongs() {
//    return songService.getAllSongs();
//}
//    @GetMapping(path = "/songs/{songId}")
//    public Song getSongs(@PathVariable Long songId) {
//        return songService.getSongs(songId);
//    }
//
//    @PostMapping("/songs/")
//    public Song createSongs(@RequestBody Song body) {
//
//        return songService.createSongs(body);
//    }
//
////    @PutMapping("/songs/{songId}")
////    public Song updateSongs(@PathVariable(value = "songId") Long songId, @RequestBody String body) {
////        return songService.updateSongs(songId, body);
////    }
//
//    @DeleteMapping("/songs/{songId}")
//    public String deleteSongs(@PathVariable(value = "songId") Long songId) {
//        return songService .deleteSongs(songId);
//    }
//}
