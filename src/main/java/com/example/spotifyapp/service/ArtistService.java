package com.example.spotifyapp.service;

import com.example.spotifyapp.model.Album;
import com.example.spotifyapp.model.Artist;
import com.example.spotifyapp.repository.AlbumRepository;
import com.example.spotifyapp.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ArtistService {

    @Autowired
    public void setArtistRepository(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;

    }

    private ArtistRepository artistRepository;


    private AlbumRepository albumRepository;

    public List<Artist> getAllArtist() {
        List<Artist> artist = artistRepository.findAll();
        return artist;

    }

    public Artist getArtists(@PathVariable Long artistId) {
        Artist artist =  artistRepository.getById(artistId);
        return  artist;
    }

    public Artist createArtist(Artist body) {
        return artistRepository.save(body);
    }

    public Artist updateArtists(@PathVariable(value = "artistId") Long artistId, @RequestBody Artist body) {
        Artist artist = artistRepository.getById(artistId);
        artist.setName(body.getName());
        return artistRepository.save(artist);
    }

    public String deleteArtists(@PathVariable(value = "artistId") Long artistId) {
        artistRepository.deleteById(artistId);
        return "deleted Artist " + artistId;
    }

}


