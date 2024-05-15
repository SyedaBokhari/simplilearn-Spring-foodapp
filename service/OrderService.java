package com.simplilearn.estore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.estore.jpa.Dish;
import com.simplilearn.estore.jpa.Order;
import com.simplilearn.estore.repository.OrderRepository;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public void saveOrder(Order order) {
        this.orderRepository.save(order);
    }

    public List<Order> getOrders() {
        return this.orderRepository.findAll();
    }

    public List<Order> getOrder(int id) {
        return this.orderRepository.findById(id);
    }

    public void deleteOrder(Order order) {
        this.orderRepository.delete(order);
    }

    
}