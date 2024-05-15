package com.simplilearn.estore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.estore.jpa.Dish;
import com.simplilearn.estore.jpa.Restaurant;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant,Integer>{

	 public List<Restaurant> findByName(String name);
}
