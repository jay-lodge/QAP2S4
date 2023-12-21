package com.keyin.passengers;

//import com.keyin.passengers.Passengers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "passengers", path = "passengers")
public interface PassengersRestApi extends JpaRepository<com.keyin.passenger.Passengers, Long> {
}
