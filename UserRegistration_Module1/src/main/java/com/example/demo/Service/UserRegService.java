package com.example.demo.Service;

import java.time.LocalDate; 
import java.time.Period;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Users;
import com.example.demo.Repository.UserRegRepo;

@Service
public class UserRegService {
	@Autowired
	UserRegRepo repo;
	
	public Users addDetails(Users obj1) {
		obj1=register(obj1);
		return repo.save(obj1);
	
	}

	public Users register(Users obj1) {
		int age = Period.between(obj1.getDateOfBirth(), LocalDate.now()).getYears();
		int t = LocalDate.now().getYear();
		if (age <= 1) {
			obj1.setCitizenship("Infant");
		} else if (age > 1 && age <= 10) {
			obj1.setCitizenship("Children");
		} else if (age > 10 && age <= 20) {
			obj1.setCitizenship("Teen");
		} else if (age > 20 && age <= 40) {
			obj1.setCitizenship("Adult");
		} else if (age > 40 && age < t) {
			obj1.setCitizenship("Senior Citizen");
		}
		
		if (obj1.getApplyType().contentEquals("Passport")) {
			int c=repo.findByUserId("PASS-");
			String s=String.valueOf(c+1);
			if(s.length()<4) {
				int k=s.length();
				for(int i=0;i<4-k;i++) {
					s="0"+s;
				}
			}
			obj1.setUserId("PASS-"+s);
		}
		else if(obj1.getApplyType().contentEquals("Visa")) {
			int c=repo.findByUserId("VISA-");
			String s=String.valueOf(c+1);
			if(s.length()<4) {
				int k=s.length();
				for(int i=0;i<4-k;i++) {
					s="0"+s;
				}
			}
			obj1.setUserId("VISA-"+s);
		}
		return obj1;
	}
}
