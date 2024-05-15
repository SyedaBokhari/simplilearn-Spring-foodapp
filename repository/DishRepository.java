package com.simplilearn.estore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.estore.jpa.Dish;

@Repository
public interface DishRepository extends JpaRepository<Dish,Integer> {

    public List<Dish> findByName(String name);
}