package com.simplilearn.estore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.estore.jpa.Admin;
import com.simplilearn.estore.jpa.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order,Integer>{

    public List<Order> findById(int id);

}
