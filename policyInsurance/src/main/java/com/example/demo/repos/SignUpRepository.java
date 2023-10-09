package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.SignUp;

@Repository
public interface SignUpRepository extends JpaRepository<SignUp, Integer> {
	
	@Query(value = "SELECT * FROM demo.userdata where login_id= :login_id and password= :password", nativeQuery = true)
	SignUp findByLoginIdAndPassword(String login_id, String password );

}
