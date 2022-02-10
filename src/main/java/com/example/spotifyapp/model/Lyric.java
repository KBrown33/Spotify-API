package com.example.spotifyapp.model;


import javax.persistence.*;

@Entity
@Table(name = "Lyrics")
public class Lyric {

      @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String text;

}
