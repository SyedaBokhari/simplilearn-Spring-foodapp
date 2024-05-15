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
import com.simplilearn.estore.jpa.Dish;
import com.simplilearn.estore.jpa.User;
import com.simplilearn.estore.service.DishService;

@CrossOrigin
@RestController
@RequestMapping("/dishes")
public class DishController {

	 final Logger logger = LoggerFactory.getLogger(this.getClass());

	    @Autowired
	    DishService dishService;

	    @PostMapping("/add")
	    HttpResponse<Dish> addDish(@RequestBody Dish dish){

	       logger.debug("Add Dish: {}", dish);

	       this.dishService.saveDish(dish);

	       return new HttpResponse<>(101, String.format("Dish Added Successfully at %tD",new Date()),List.of(dish));
	    }

	    @PutMapping("/update")
	    HttpResponse<Dish> updateDish(@RequestBody Dish dish){

	        logger.debug("Update Dish: {}", dish);

	        this.dishService.saveDish(dish);

	        return new HttpResponse<>(101, String.format("Dish Updated Successfully at %tD",new Date()),List.of(dish));
	    }

	    @GetMapping("/get")
	    HttpResponse<Dish> getDishes(){

	        logger.debug("Get Dishes");

	        List<Dish> dishes = this.dishService.getDishes();

	        return new HttpResponse<>(101, String.format("Dishes Fetched Successfully at %tD",new Date()),dishes);
	    }

	    @GetMapping("/get/{id}")
	    HttpResponse<Dish> getDish(@PathVariable int id){

	        logger.debug("Get Dish, dishId: {}", id);

	        Optional<Dish> opt = this.dishService.getDish(id);

	        if (opt.isPresent()) {

	            return new HttpResponse<>(101, String.format("Dish Fetched Successfully at %tD",new Date()),List.of(opt.get()));
	        }
	        else {
	            return new HttpResponse<>(201, String.format("Dish was not Found at %tD",new Date()),null);
	        }
	    }

	    @DeleteMapping("/delete/{id}")
	    HttpResponse<Dish> deleteDish(@PathVariable int id){

	        logger.debug("Delete dish, userId: {}", id);

	        Optional<Dish> opt = this.dishService.getDish(id);

	        if (opt.isPresent()) {

	            this.dishService.deleteDish(opt.get());
	            return new HttpResponse<>(101, String.format("Dish Deleted Successfully at %tD",new Date()),null);
	        }
	        else {
	            return new HttpResponse<>(201, String.format("Dish was not Found at %tD",new Date()),null);
	        }
	    }

	   


}
