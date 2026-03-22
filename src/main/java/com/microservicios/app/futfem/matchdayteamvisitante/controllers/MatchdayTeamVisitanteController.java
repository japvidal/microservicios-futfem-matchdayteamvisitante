package com.microservicios.app.futfem.matchdayteamvisitante.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservicios.app.common.controllers.CommonController;
import com.microservicios.app.futfem.matchdayteamvisitante.models.entity.MatchdayTeamVisitante;
import com.microservicios.app.futfem.matchdayteamvisitante.services.MatchdayTeamVisitanteService;

@RestController
public class MatchdayTeamVisitanteController extends CommonController<MatchdayTeamVisitante, MatchdayTeamVisitanteService> {
	
	@DeleteMapping("/")
	public ResponseEntity<?> eliminarDatos(){
		service.eliminarDatos();
		return ResponseEntity.noContent().build(); // HTTPStatus 204
	}
}
