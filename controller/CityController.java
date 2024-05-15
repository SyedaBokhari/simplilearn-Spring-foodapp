package com.simplilearn.estore.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.estore.domain.HttpResponse;
import com.simplilearn.estore.jpa.City;

import com.simplilearn.estore.service.CityService;

@CrossOrigin
@RestController
@RequestMapping("/cities")
public class CityController {

	 final Logger logger = LoggerFactory.getLogger(this.getClass());

	    @Autowired
	    CityService cityService;

	    @PostMapping("/add")
	    HttpResponse<City> addCity(@RequestBody City city){

	       logger.debug("Add City: {}", city);

	       this.cityService.saveCity(city);

	       return new HttpResponse<>(101, String.format("City Added Successfully at %tD",new Date()),List.of(city));
	    }

	    @PutMapping("/update")
	    HttpResponse<City> updateCity(@RequestBody City city){

	        logger.debug("Update city: {}", city);

	        this.cityService.saveCity(city);

	        return new HttpResponse<>(101, String.format("City Updated Successfully at %tD",new Date()),List.of(city));
	    }

	    @GetMapping("/get")
	    HttpResponse<City> getCities(){

	        logger.debug("Get Cities");

	        List<City> cities = this.cityService.getCities();

	        return new HttpResponse<>(101, String.format("Cities Fetched Successfully at %tD",new Date()),cities);
	    }

	    @GetMapping("/get/{id}")
	    HttpResponse<City> getCity(@PathVariable int id){

	        logger.debug("Get City, cityId: {}", id);

	        Optional<City> opt = this.cityService.getCity(id);

	        if (opt.isPresent()) {

	            return new HttpResponse<>(101, String.format("City Fetched Successfully at %tD",new Date()),List.of(opt.get()));
	        }
	        else {
	            return new HttpResponse<>(201, String.format("City was not Found at %tD",new Date()),null);
	        }
	    }

	    @DeleteMapping("/delete/{id}")
	    HttpResponse<City> deleteCity(@PathVariable int id){

	        logger.debug("Delete city, userId: {}", id);

	        Optional<City> opt = this.cityService.getCity(id);

	        if (opt.isPresent()) {

	            this.cityService.deleteCity(opt.get());
	            return new HttpResponse<>(101, String.format("City Deleted Successfully at %tD",new Date()),null);
	        }
	        else {
	            return new HttpResponse<>(201, String.format("City was not Found at %tD",new Date()),null);
	        }
	    }
	
}
