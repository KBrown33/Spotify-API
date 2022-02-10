package com.example.spotifyapp.model;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "albums")
public class Album {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String trackname;

    @Column
    private Integer tracknumber;

    // one album can have many songs
    @OneToMany(mappedBy = "album",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL
    )
    private Set<Song> album;


}
