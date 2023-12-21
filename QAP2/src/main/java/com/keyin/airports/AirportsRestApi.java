package com.keyin.airports;

import com.keyin.airports.Airports;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "airports", path = "airports")
public interface AirportsRestApi extends JpaRepository<Airports, Long> {
}
