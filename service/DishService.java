package com.simplilearn.estore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.estore.jpa.Dish;
import com.simplilearn.estore.jpa.User;
import com.simplilearn.estore.repository.DishRepository;

@Service
public class DishService {

    @Autowired
    DishRepository dishRepository;

    public void saveDish(Dish dish) {
        this.dishRepository.save(dish);
    }

    public List<Dish> getDishes() {
        return this.dishRepository.findAll();
    }

    public Optional<Dish> getDish(int id) {
        return this.dishRepository.findById(id);
    }

    public void deleteDish(Dish dish) {
        this.dishRepository.delete(dish);
    }

    
}