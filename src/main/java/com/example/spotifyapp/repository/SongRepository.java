package com.example.spotifyapp.repository;

import com.example.spotifyapp.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SongRepository extends JpaRepository<Song, Long> {
//    Song findBySongId(Long songId);
//    Song findSongsByLyricId(Long lyricId);
//    List<Song> findSongsByAlbumId(Long albumId);
//    List<Song> findSongsByArtistId (Long artistId);
}
