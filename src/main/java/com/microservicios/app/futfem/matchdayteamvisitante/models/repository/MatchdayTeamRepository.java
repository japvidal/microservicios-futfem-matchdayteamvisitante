package com.microservicios.app.futfem.matchdayteamvisitante.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.microservicios.app.futfem.matchdayteamvisitante.models.entity.MatchdayTeamVisitante;

public interface MatchdayTeamRepository extends CrudRepository<MatchdayTeamVisitante, Long> {

	
}
