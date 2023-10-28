package br.edu.atitus.pooavancado.atitusound.controllers;

import br.edu.atitus.pooavancado.atitusound.entities.MusicEntity;
import br.edu.atitus.pooavancado.atitusound.entities.dtos.MusicDTO;
import br.edu.atitus.pooavancado.atitusound.services.GenericService;
import br.edu.atitus.pooavancado.atitusound.services.MusicService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/musics")
public class MusicController extends GenericController<MusicEntity, MusicDTO> {

    private MusicService musicService;

    public MusicController(MusicService musicService) {
        super();
        this.musicService = musicService;
    }

    protected MusicEntity convertDTO2Entity(MusicDTO dto) {
        MusicEntity entidade = new MusicEntity();
        entidade.setName(dto.getName());
        entidade.setDuration(dto.getDuration());
        entidade.setLikes_count(dto.getLikes_count());
        return entidade;
    }

    @Override
    GenericService<MusicEntity> getService() {
        return musicService;
    }
}
