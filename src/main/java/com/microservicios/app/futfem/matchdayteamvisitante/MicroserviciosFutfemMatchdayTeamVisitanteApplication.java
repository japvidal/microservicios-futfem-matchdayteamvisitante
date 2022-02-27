package com.microservicios.app.futfem.matchdayteamvisitante;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroserviciosFutfemMatchdayTeamVisitanteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosFutfemMatchdayTeamVisitanteApplication.class, args);
	}

}
