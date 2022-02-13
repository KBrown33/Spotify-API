package com.example.spotifyapp.repository;


import com.example.spotifyapp.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Long> {

    Album findByAlbumId(Long albumId);
}
