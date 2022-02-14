package com.example.spotifyapp.controller;


import com.example.spotifyapp.model.Album;
import com.example.spotifyapp.model.Artist;
import com.example.spotifyapp.service.AlbumService;
import com.example.spotifyapp.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class ArtistController {



    private ArtistService artistService;
    @Autowired
    public void setArtistService(ArtistService artistService) {
        this.artistService = artistService;

    }

//    @GetMapping("/hello-world/")
//    public String helloWorld(){
//        return "Hello World";
//    }
    @GetMapping(path = "/artists/")
    public List<Artist> getAllArtists(          ) {
            return artistService.getAllArtist();
    }

    @GetMapping(path = "/artists/{artistId}")
    public Artist getArtists(@PathVariable Long artistId) {
        return artistService.getArtists(artistId);
    }

    @PostMapping("/artists/")
    public Artist createArtists(@RequestBody Artist body) {
        return artistService.createArtist(body);
    }

    @PutMapping("/artists/{artistId}")
    public Artist updateArtists(@PathVariable(value = "artistId") Long artistId, @RequestBody Artist body) {
        return artistService.updateArtists(artistId, body);
    }

    @DeleteMapping("/artists/{artistId}")
    public String deleteArtists(@PathVariable(value = "artistId") Long artistId) {
        return artistService .deleteArtists(artistId);
    }
}
