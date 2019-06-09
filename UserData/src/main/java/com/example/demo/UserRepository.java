package com.example.demo;

import com.example.demo.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;;

public interface UserRepository extends JpaRepository<User, Long>{
	public User findById(int id);
	public void deleteById(int id);
}
