package br.edu.atitus.pooavancado.atitusound.entities;

import jakarta.persistence.*;

import java.time.Duration;
import java.util.UUID;

@ManyToOne(fetch = FetchType.EAGER)
@JoinColumn(name = "artist_uuid")
public class MusicEntity extends GenericEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID uuid;

    @Column(nullable = false)
    private String name;


    private Duration duration;

    private int likes_count;

    private String url;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

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
