package com.aulaGuilherme.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulaGuilherme.course.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}
