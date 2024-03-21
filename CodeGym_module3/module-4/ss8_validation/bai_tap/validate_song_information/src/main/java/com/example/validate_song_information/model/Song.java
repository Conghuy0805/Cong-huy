package com.example.validate_song_information.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer songId;
    @NotBlank(message = "Không được để trống")
    @Size(max = 800, message = "Không vượt quá 800 ký tự")
    @Pattern(regexp = "^[^@;,.=+\\-]+$", message = "Không chứa các kí tự đặc biệt như @ ; , . = - + , ….")
    private String nameSong;

    @NotBlank(message = "Không được để trống")
    @Size(max = 300, message = "Không vượt quá 800 ký tự")
    @Pattern(regexp = "^[^@;,.=+\\-]+$", message = "Không chứa các kí tự đặc biệt như @ ; , . = - + , ….")
    private String artist;

    @NotBlank(message = "Không được để trống")
    @Size(max = 1000, message = "Không vượt quá 800 ký tự")
    @Pattern(regexp = "^[^!@#%^&*()\\-+=~`<>?/\\\\|[\\]{}:;\"'.]]+$", message = "Không chứa các kí tự đặc biệt như @ ; , . = - + , …. ngoại trừ dấu phẩy")
    private String category;

    public Song() {
    }

    public Song(Integer songId, String nameSong, String artist, String category) {
        this.songId = songId;
        this.nameSong = nameSong;
        this.artist = artist;
        this.category = category;
    }

    public Integer getSongId() {
        return songId;
    }

    public void setSongId(Integer songId) {
        this.songId = songId;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
