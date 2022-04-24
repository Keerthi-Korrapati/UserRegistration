package com.example.demo.Controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Exception.DOBNotFoundException;
import com.example.demo.Model.Users;
import com.example.demo.Service.UserRegService;

@RestController
@RequestMapping("/Users")
public class UserRegRestController {
	@Autowired
	UserRegService service;

	@PostMapping("/addDetails")
	public ResponseEntity<String> addDetails(@Validated @RequestBody Users reg) {
		
		if(reg.getDateOfBirth().isAfter(LocalDate.now())) {
			throw new DOBNotFoundException("Date Of Birth should be correct");
		}
		
		Users Response = service.addDetails(reg);
		return new ResponseEntity<String>("Dear User,"+"\n"+"Your User Id is "+reg.getUserId()+" and your password is "+reg.getPassword()+"\n"+"You are planning for "+reg.getApplyType()+" and your citizenship is of "+reg.getCitizenship(), HttpStatus.OK);
		
	
	}

}
