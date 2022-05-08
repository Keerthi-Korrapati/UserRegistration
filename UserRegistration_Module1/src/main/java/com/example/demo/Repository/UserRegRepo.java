package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Users;
@Repository
public interface UserRegRepo extends JpaRepository<Users, String>{
	@Query("SELECT Count(p) FROM Users p WHERE p.userId LIKE CONCAT(:userId,'%')")
	public int findByUserId(@Param("userId") String userId);
}
