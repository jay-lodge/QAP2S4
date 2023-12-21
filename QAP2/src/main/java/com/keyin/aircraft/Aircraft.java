package com.keyin.aircraft;

import com.keyin.airports.Airports;
import com.keyin.airports.Airports;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Aircraft {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tailNumber;

    private String type;
    private String airlineName;
    private int numberOfPassengers;

    @ManyToMany
    @JoinTable(
            name = "aircraft_passenger",
            joinColumns = @JoinColumn(name = "aircraft_id"),
            inverseJoinColumns = @JoinColumn(name = "passenger_id"))
    private List<com.keyin.passenger.Passengers> passengers;

    @ManyToMany
    @JoinTable(
            name = "aircraft_airport",
            joinColumns = @JoinColumn(name = "aircraft_id"),
            inverseJoinColumns = @JoinColumn(name = "airport_id"))
    private List<Airports> airports;

    public String getTailNumber() {
        return tailNumber;
    }

    public void setTailNumber(String tailNumber) {
        this.tailNumber = tailNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public List<com.keyin.passenger.Passengers> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<com.keyin.passenger.Passengers> passengers) {
        this.passengers = passengers;
    }

    public List<Airports> getAirports() {
        return airports;
    }

    public void setAirports(List<Airports> airports) {
        this.airports = airports;
    }
}