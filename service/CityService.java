package com.simplilearn.estore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.estore.jpa.City;
import com.simplilearn.estore.jpa.Dish;
import com.simplilearn.estore.repository.CityRepository;

@Service
public class CityService {

    @Autowired
    CityRepository cityRepository;

    public void saveCity(City city) {
        this.cityRepository.save(city);
    }

    public List<City> getCities() {
        return this.cityRepository.findAll();
    }

    public Optional<City> getCity(int id) {
        return this.cityRepository.findById(id);
    }

    public void deleteCity(City city) {
        this.cityRepository.delete(city);
    }

    
}