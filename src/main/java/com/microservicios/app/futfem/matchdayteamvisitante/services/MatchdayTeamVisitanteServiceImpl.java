package com.microservicios.app.futfem.matchdayteamvisitante.services;

import org.springframework.stereotype.Service;

import com.microservicios.app.common.services.CommonServiceImpl;
import com.microservicios.app.futfem.matchdayteamvisitante.models.entity.MatchdayTeamVisitante;
import com.microservicios.app.futfem.matchdayteamvisitante.models.repository.MatchdayTeamRepository;

@Service
public class MatchdayTeamVisitanteServiceImpl extends CommonServiceImpl<MatchdayTeamVisitante, MatchdayTeamRepository> implements MatchdayTeamVisitanteService {

	public void eliminarDatos(){
		repository.deleteAll();
	}
}
