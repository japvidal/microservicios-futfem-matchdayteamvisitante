package com.microservicios.app.futfem.matchdayteamvisitante.services;

import com.microservicios.app.common.services.CommonService;
import com.microservicios.app.futfem.matchdayteamvisitante.models.entity.MatchdayTeamVisitante;

public interface MatchdayTeamVisitanteService extends CommonService<MatchdayTeamVisitante>{
	
	public void eliminarDatos();
}
