package com.learnSpheree.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnSpheree.entities.Users;

public interface UsersRepository extends JpaRepository<Users,Integer>
{
	Users findByEmail(String email);
	boolean existsByEmail(String email);

	
	
	
	
}
