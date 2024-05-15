package com.simplilearn.estore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.estore.jpa.Cart;
import com.simplilearn.estore.jpa.City;

@Repository
public interface CityRepository extends JpaRepository<City,Integer>{

	public List<City> findBycityName(String cityName);
}
