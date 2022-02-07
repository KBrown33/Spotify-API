package com.example.spotifyapp.model;



import javax.persistence.*;

@Entity
@Table(name = "songs")
public class Song {


     @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;
}
