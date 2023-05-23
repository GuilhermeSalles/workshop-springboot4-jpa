package com.aulaGuilherme.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulaGuilherme.course.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
