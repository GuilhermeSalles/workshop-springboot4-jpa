package com.aulaGuilherme.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulaGuilherme.course.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
