package com.example.spotifyapp.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class AlbumController {

//    @GetMapping("/hello-world/")
//    public String helloWorld(){
//        return "Hello World";
//    }
    @GetMapping(path = "/albums/")
    public String getAlbums() {
            return "get all albums";
    }

    @GetMapping(path = "/albums/{albumId}")
    public String getAlbums(@PathVariable Long albumId) {
        return "getting the album with the id of " + albumId;
    }

    @PostMapping("/albums/")
    public String createAlbums(@RequestBody String body) {
        return "creating a albums " + body;
    }

    @PutMapping("/albums/{albumId}")
    public String updateAlbums(@PathVariable(value = "albumId") Long albumId, @RequestBody String body) {
        return "updating the album with the id of " + albumId + body;
    }

    @DeleteMapping("/albums/{albumId}")
    public String deleteAlbums(@PathVariable(value = "albumId") Long albumId) {
        return "deleting the album with the id of " + albumId;
    }
}
