package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Model.Users;
@Repository
public interface UserRegRepo extends JpaRepository<Users, String>{

	@Query("SELECT COUNT(p) FROM Users p WHERE p.userId LIKE CONCAT(:userId,'%')")
	public String findByUserId(@Param("userId") String userId);
		/*
		 * @Query("SELECT MAX(CAST(SUBSTRING(p,6,LEN(p)) AS int)) FROM Users p WHERE p.userId LIKE 'PASS-%' OR p.userId LIKE 'VISA-%'"
		 * ) public String findByUserId(@Param("userId") String userId);
		 */
	    /*
	     * @Query("SELECT MAX(SUBSTRING(p,5,LEN(p)-5)) FROM Users p WHERE p.userId LIKE CONCAT(:userId,'%')"
	     * ) public String findByUserId(@Param("userId") String userId);
	     */
	 
	

}
