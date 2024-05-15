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
import com.simplilearn.estore.jpa.Restaurant;
import com.simplilearn.estore.service.RestaurantService;

@CrossOrigin
@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

	final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    RestaurantService restaurantService;

    @PostMapping("/add")
    HttpResponse<Restaurant> addRestaurant(@RequestBody Restaurant restaurant){

       logger.debug("Add Restaurant: {}", restaurant);

       this.restaurantService.saveRestaurant(restaurant);

       return new HttpResponse<>(101, String.format("Restaurant Added Successfully at %tD",new Date()),List.of(restaurant));
    }

    @PutMapping("/update")
    HttpResponse<Restaurant> updateRestaurant(@RequestBody Restaurant restaurant){

        logger.debug("Update Dish: {}", restaurant);

        this.restaurantService.saveRestaurant(restaurant);

        return new HttpResponse<>(101, String.format("Restaurant Updated Successfully at %tD",new Date()),List.of(restaurant));
    }

    @GetMapping("/get")
    HttpResponse<Restaurant> getRestaurant(){

        logger.debug("Get Restaurants");

        List<Restaurant> restaurant = this.restaurantService.getRestaurant();

        return new HttpResponse<>(101, String.format("Restaurants Fetched Successfully at %tD",new Date()),restaurant);
    }

    @GetMapping("/get/{id}")
    HttpResponse<Restaurant> getRestaurant(@PathVariable int id){

        logger.debug("Get Restaurant, restaurantId: {}", id);

        Optional<Restaurant> opt = this.restaurantService.getRestaurant(id);

        if (opt.isPresent()) {

            return new HttpResponse<>(101, String.format("Restaurant Fetched Successfully at %tD",new Date()),List.of(opt.get()));
        }
        else {
            return new HttpResponse<>(201, String.format("Restaurant was not Found at %tD",new Date()),null);
        }
    }

    @DeleteMapping("/delete/{id}")
    HttpResponse<Restaurant> deleteRestaurant(@PathVariable int id){

        logger.debug("Delete restaurant, userId: {}", id);

        Optional<Restaurant> opt = this.restaurantService.getRestaurant(id);

        if (opt.isPresent()) {

            this.restaurantService.deleteRestaurant(opt.get());
            return new HttpResponse<>(101, String.format("Restaurant Deleted Successfully at %tD",new Date()),null);
        }
        else {
            return new HttpResponse<>(201, String.format("Restaurant was not Found at %tD",new Date()),null);
        }
    }
}
