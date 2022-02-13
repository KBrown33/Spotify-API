package com.example.spotifyapp.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

@Entity

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "albums")
public class Album {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String Albumname;

    @Column
    private String Artistname;

    // one album can have many songs
    @OneToMany(mappedBy = "album",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL
    )
    @JsonIgnore
    private Set<Song> album;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAlbumname() {
        return Albumname;
    }

    public void setAlbumname(String albumname) {
        Albumname = albumname;
    }

    public String getArtistname() {
        return Artistname;
    }

    public void setArtistname(String artistname) {
        Artistname = artistname;
    }

    public Set<Song> getAlbum() {
        return album;
    }

    public void setAlbum(Set<Song> album) {
        this.album = album;
    }
}
