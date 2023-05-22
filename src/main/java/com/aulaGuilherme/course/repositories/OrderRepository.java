package com.aulaGuilherme.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulaGuilherme.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
