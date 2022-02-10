package com.example.spotifyapp.model;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "artists")
public class Artist {


    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @OneToMany(mappedBy = "artist",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL
    )
    private Set<Song> artist;
}
