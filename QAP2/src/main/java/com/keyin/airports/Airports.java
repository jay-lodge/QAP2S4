package com.keyin.airports;

import com.keyin.aircraft.Aircraft;
import com.keyin.cities.Cities;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Airports {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String code;

    @ManyToOne
    private Cities cities;

    @ManyToMany(mappedBy = "airports")
    private List<Aircraft> aircraft;

    // getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Cities getCity() {
        return cities;
    }

    public void setCity(Cities city) {
        this.cities = city;
    }

    public List<Aircraft> getAircraft() {
        return aircraft;
    }

    public void setAircraft(List<Aircraft> aircraft) {
        this.aircraft = aircraft;
    }
}