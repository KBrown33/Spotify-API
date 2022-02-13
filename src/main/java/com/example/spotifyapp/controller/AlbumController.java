package com.example.spotifyapp.controller;


import com.example.spotifyapp.model.Album;
import com.example.spotifyapp.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class AlbumController {

    private AlbumService albumService;
    @Autowired
    public void setAlbumService(AlbumService albumService) {
        this.albumService = albumService;
    }

    //    @GetMapping("/hello-world/")
//    public String helloWorld(){
//        return "Hello World";
//    }
    @GetMapping(path = "/albums/")
    public List<Album> getAllAlbums() {
      return  albumService.getAllAlbums();
    }

    @GetMapping(path = "/albums/{albumId}/")
    public Album getAlbums(@PathVariable(value = "albumId") Long albumId) {
        return albumService.getAlbums(albumId);
    }

    @PostMapping("/albums/")
    public Album createAlbums(@RequestBody Album body) {
        return albumService.createAlbums(body);
    }

    @PutMapping("/albums/{albumId}")
    public Album updateAlbums(@PathVariable(value = "albumId") Long albumId, @RequestBody Album body) {
        return albumService.updateAlbums(albumId, body);
    }

    @DeleteMapping("/albums/{albumId}")
    public String deleteAlbums(@PathVariable(value = "albumId") Long albumId) {
        return albumService .deleteAlbums(albumId);
    }
}
