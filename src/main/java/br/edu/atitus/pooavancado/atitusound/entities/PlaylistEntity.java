package br.edu.atitus.pooavancado.atitusound.entities;

import jakarta.persistence.*;
import java.util.UUID;

@ManyToMany(fetch = FetchType.EAGER)
@JoinTable(name = "tb_playlist_music")
public class PlaylistEntity extends GenericEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID uuid;

    @Column(nullable = false)
    private String name;

    private boolean public_share;

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

    public boolean isPublic_share() { return public_share;}

    public void setPublic_share(boolean public_share) { this.public_share = public_share;}
}
