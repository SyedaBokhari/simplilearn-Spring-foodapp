package com.simplilearn.estore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.estore.jpa.Cart;

@Repository
public interface PaymentRepository extends JpaRepository<Cart,Integer>{

}
