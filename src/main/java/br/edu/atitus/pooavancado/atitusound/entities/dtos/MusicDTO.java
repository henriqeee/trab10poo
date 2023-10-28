package br.edu.atitus.pooavancado.atitusound.entities.dtos;

import java.time.Duration;
import java.util.UUID;

public class MusicDTO {

    private String name;

    private Duration duration;

    private int likes_count;

    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLikes_count() {return likes_count;}

    public void setLikes_count(int likes_count) {this.likes_count = likes_count;}

    public Duration getDuration() {return duration;}

    public void setDuration(Duration duration) {this.duration = duration;}
}
