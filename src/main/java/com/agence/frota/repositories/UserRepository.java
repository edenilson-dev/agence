package com.agence.frota.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agence.frota.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUsername(String userName);
	
}
