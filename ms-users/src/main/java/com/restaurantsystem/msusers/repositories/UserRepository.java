package com.restaurantsystem.msusers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurantsystem.msusers.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
