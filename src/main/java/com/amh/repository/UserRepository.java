package com.amh.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amh.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Serializable>{
	
	public abstract User findByUsername(String username);
}
