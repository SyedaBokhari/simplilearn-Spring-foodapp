package com.simplilearn.estore.controller;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.estore.domain.HttpResponse;
import com.simplilearn.estore.jpa.Order;
import com.simplilearn.estore.service.OrderService;

@CrossOrigin
@RestController
@RequestMapping("/orders")
public class OrderController {

	 final Logger logger = LoggerFactory.getLogger(this.getClass());

	    @Autowired
	    OrderService orderService;

	    @PostMapping("/add")
	    HttpResponse<Order> addOrder(@RequestBody Order order){

	       logger.debug("Add Order: {}", order);

	       this.orderService.saveOrder(order);

	       return new HttpResponse<>(101, String.format("Order Added Successfully at %tD",new Date()),List.of(order));
	    }
	    
	    @GetMapping("/get")
	    HttpResponse<Order> getOrders(){

	        logger.debug("Get Orders");

	        List<Order> order = this.orderService.getOrders();

	        return new HttpResponse<>(101, String.format("Ordre Fetched Successfully at %tD",new Date()),order);
	    }
	    
}
