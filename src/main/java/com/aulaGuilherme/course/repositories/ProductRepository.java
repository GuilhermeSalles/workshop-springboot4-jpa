package com.aulaGuilherme.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulaGuilherme.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
