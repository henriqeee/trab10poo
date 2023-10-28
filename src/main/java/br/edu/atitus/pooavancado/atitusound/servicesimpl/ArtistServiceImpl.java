package br.edu.atitus.pooavancado.atitusound.servicesimpl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import br.edu.atitus.pooavancado.atitusound.repositories.GenericRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.edu.atitus.pooavancado.atitusound.entities.ArtistEntity;
import br.edu.atitus.pooavancado.atitusound.repositories.ArtistRepository;
import br.edu.atitus.pooavancado.atitusound.services.ArtistService;

@Service
public class ArtistServiceImpl implements ArtistService {

	private ArtistRepository artistRepository;

	public ArtistServiceImpl(ArtistRepository artistRepository) {
		super();
		this.artistRepository = artistRepository;
	}


	@Override
	public GenericRepository<ArtistEntity> getRepository() {
		return null;
	}
}
