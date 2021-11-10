package com.adrianopequeno.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adrianopequeno.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
