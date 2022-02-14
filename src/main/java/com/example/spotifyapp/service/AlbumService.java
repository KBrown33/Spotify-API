package com.example.spotifyapp.service;

import com.example.spotifyapp.model.Album;
import com.example.spotifyapp.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class AlbumService {

    @Autowired
    public void setAlbumRepository(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    private AlbumRepository albumRepository;

    public List<Album> getAllAlbums() {
        List<Album> albums = albumRepository.findAll();
        return albums;
    }


    public Album getAlbums(@PathVariable Long albumId) {
        Album album =  albumRepository.getById(albumId);
        return  album;
    }


    public Album createAlbums( Album body) {
         return albumRepository.save(body);
    }


    public Album updateAlbums(@PathVariable(value = "albumId") Long albumId, @RequestBody Album body) {
        Album album = albumRepository.getById(albumId);
        album.setAlbumname(body.getAlbumname());
        album.setArtistname(body.getArtistname());
        return albumRepository.save(album);
    }


    public String deleteAlbums(@PathVariable(value = "albumId") Long albumId) {
        albumRepository.deleteById(albumId);
        return "deleted Album " + albumId;
    }
}
