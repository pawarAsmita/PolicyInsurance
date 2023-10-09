package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Policy;

@Repository
public interface PolicyRepository extends JpaRepository<Policy, Integer> {
	@Modifying
	@Query(value = "delete from demo.policy where Id=:Id", nativeQuery = true)
	void deletebyPolicy(int Id);

}
