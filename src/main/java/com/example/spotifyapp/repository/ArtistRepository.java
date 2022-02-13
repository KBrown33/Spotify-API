package com.example.spotifyapp.repository;

import com.example.spotifyapp.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository <Artist,Long> {
    Artist findArtistById(Long artistId);
}
