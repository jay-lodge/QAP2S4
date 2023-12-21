package com.keyin.cities;

import com.keyin.cities.Cities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "cities", path = "cities")
public interface CitiesRestApi extends JpaRepository<Cities, Long> {
}
