package br.edu.atitus.pooavancado.atitusound.controllers;

import br.edu.atitus.pooavancado.atitusound.entities.PlaylistEntity;
import br.edu.atitus.pooavancado.atitusound.entities.dtos.PlaylistDTO;
import br.edu.atitus.pooavancado.atitusound.services.GenericService;
import br.edu.atitus.pooavancado.atitusound.services.PlaylistService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/playlists")
public class PlaylistController extends GenericController<PlaylistEntity, PlaylistDTO> {

    private PlaylistService playlistService;

    public PlaylistController(PlaylistService playlistService) {
        super();
        this.playlistService = playlistService;
    }

    protected PlaylistEntity convertDTO2Entity(PlaylistDTO dto) {
        PlaylistEntity entidade = new PlaylistEntity();
        entidade.setName(dto.getName());
        entidade.setPublic_share(dto.isPublic_share());
        return entidade;
    }

    @Override
    GenericService<PlaylistEntity> getService() {
        return playlistService;
    }

}
