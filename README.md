# microservicios-futfem-matchdayteamvisitante

`microservicios-futfem-matchdayteamvisitante` manages the away team information required during matchday workflows. It mirrors the role of the local matchday team service, but for the visiting side, helping the Tikitakas backend keep matchday state isolated and easier to evolve independently.

The repository is built with Java 21, Spring Boot, Spring Data JPA, MySQL, Springdoc OpenAPI, and Maven Wrapper. It relies on `microservicios-common` for reusable CRUD abstractions and integrates with Eureka for service discovery. Externally, the expected entry point is the API gateway, which exposes this service through a dedicated route.

Typical local execution:

```bash
./mvnw spring-boot:run
```

Gateway route:

- `/api/futfem/matchdayteamvisitante/**`

The `v0.1.0` version includes CI support, Docker packaging, and Swagger metadata configured specifically for gateway access. That prevents the documentation from advertising internal hostnames and keeps the developer experience consistent across all the futfem services.

This repository is a good fit whenever visitor-side matchday team information requires a separate persistence model, API lifecycle, or operational boundary from the broader team directory used elsewhere in the application.
