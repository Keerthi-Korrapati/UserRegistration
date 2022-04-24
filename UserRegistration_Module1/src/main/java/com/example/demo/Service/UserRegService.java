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

	public Users addDetails(Users obj) {
		obj = repo.save(AgeCal(obj));
		return repo.save(obj);
	}

	public Users AgeCal(Users obj) {
		int age = Period.between(obj.getDateOfBirth(), LocalDate.now()).getYears();
		int t = LocalDate.now().getYear();
		if (age <= 1) {
			obj.setCitizenship("Infant");
		} else if (age > 1 && age <= 10) {
			obj.setCitizenship("Children");
		} else if (age > 10 && age <= 20) {
			obj.setCitizenship("Teen");
		} else if (age > 20 && age <= 40) {
			obj.setCitizenship("Adult");
		} else if (age > 40 && age < t) {
			obj.setCitizenship("Senior Citizen");
		}
		return obj;
	}

	/*
	 * public Users generateUserId(Users obj) { Users userId=new Users();
	 * if(obj.getApplyType()=="Passport") { // String
	 * n=repo.findByUserId(String.valueOf(obj.getUserId().charAt(5))+String.valueOf(
	 * obj.getUserId().charAt(6))+String.valueOf(obj.getUserId().charAt(7))+String.
	 * valueOf(obj.getUserId().charAt(8)));
	 * 
	 * int n1=Integer.parseInt(n); int max=n1+1; String
	 * s1="PASS-"+String.valueOf(max); userId.setUserId(s1);
	 * 
	 * String n="PASS-"; String t=n+1;
	 * 
	 * if(n.length()<9) { int k=t.length(); for(int i=0;i<9-k;i++) t="0"+t;
	 * 
	 * } String s1="PASS-"+t; userId.setUserId(s1);
	 * 
	 * //repo.save(userId); }else if(obj.getApplyType()=="Visa") {
	 * 
	 * String
	 * n=repo.findByUserId(String.valueOf(obj.getUserId().charAt(5))+String.valueOf(
	 * obj.getUserId().charAt(6))+String.valueOf(obj.getUserId().charAt(7))+String.
	 * valueOf(obj.getUserId().charAt(8))); //String n="VISA-"; int
	 * n1=Integer.parseInt(n); int max=n1+1;
	 * 
	 * String n="VISA-"; String t=n+1;
	 * 
	 * if(t.length()<9) { int k=t.length(); for(int i=0;i<9-k;i++) t="0"+t; } String
	 * s1="VISA-"+t; userId.setUserId(s1); } return repo.save(userId); }
	 */

	
	
	
	/*
	 * public Users generateUserId(Users obj) { String
	 * s=repo.findByUserId(obj.getUserId());
	 * 
	 * Users user=new Users(); if(obj.getApplyType()=="Passport") { String
	 * s1=s.substring(5, 9); String s2=String.valueOf(s1); int
	 * n=Integer.parseInt(s2); int m=n+1; if(!obj.getUserId().isEmpty()) { String
	 * id="PASS-"+n; user.setUserId(id); }
	 * 
	 * }else if(obj.getApplyType()=="Visa"){
	 * //user.setUserId("VISA-"+(s.substring(6, s.length()-1))+1); String
	 * s1=s.substring(5, 9); String s2=String.valueOf(s1); int
	 * n=Integer.parseInt(s2); int m=n+1; if(!obj.getUserId().isEmpty()) { String
	 * id="VISA-"+n; user.setUserId(id); } } return repo.save(user);
	 */

	// repo.save(userId);

}
