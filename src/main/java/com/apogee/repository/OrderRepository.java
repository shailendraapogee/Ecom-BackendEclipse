package com.apogee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apogee.EntityModel.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
