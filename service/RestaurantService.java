package com.simplilearn.estore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.estore.jpa.Restaurant;
import com.simplilearn.estore.jpa.User;
import com.simplilearn.estore.repository.RestaurantRepository;

@Service
public class RestaurantService {

    @Autowired
    RestaurantRepository restaurantRepository;

    public void saveRestaurant(Restaurant restaurant) {
        this.restaurantRepository.save(restaurant);
    }

    public List<Restaurant> getRestaurant() {
        return this.restaurantRepository.findAll();
    }

    public Optional<Restaurant> getRestaurant(int id) {
        return this.restaurantRepository.findById(id);
    }

    public void deleteRestaurant(Restaurant restaurant) {
        this.restaurantRepository.delete(restaurant);
    }

}