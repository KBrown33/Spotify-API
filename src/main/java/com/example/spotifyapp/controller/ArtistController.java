package com.example.spotifyapp.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class ArtistController {
    @GetMapping("/hello-world/")
    public String helloWorld(){
        return "Hello World";
    }
    @GetMapping(path = "/artists/")
    public String getArtists() {
            return "get all artists";
    }

    @GetMapping(path = "/artists/{artistId}")
    public String getArtists(@PathVariable Long artistId) {
        return "getting the artist with the id of " + artistId;
    }

    @PostMapping("/artists/")
    public String createArtists(@RequestBody String body) {
        return "creating a artist " + body;
    }

    @PutMapping("/artists/{artistId}")
    public String updateArtists(@PathVariable(value = "artistId") Long artistId, @RequestBody String body) {
        return "updating the artist with the id of " + artistId + body;
    }

    @DeleteMapping("/artists/{artistId}")
    public String deleteArtists(@PathVariable(value = "artistId") Long artistId) {
        return "deleting the artist with the id of " + artistId;
    }
}
