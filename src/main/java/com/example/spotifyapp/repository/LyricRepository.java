package com.example.spotifyapp.repository;

import com.example.spotifyapp.model.Lyric;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LyricRepository extends JpaRepository<Lyric, Long> {
    Lyric findLyricById (Long lyricId);
}
