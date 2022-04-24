package com.example.demo.Model;

import java.time.LocalDate; 

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Range;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Users {
	
	@Id 
	private String userId;
	
	@NotBlank(message="Name must not be blank:601")
	@Pattern(regexp="^[A-Za-z]*$",message ="Name should be alphabets:501")
	private String name;
	
	@NotBlank(message="Password must not be blank:602")
	@Pattern(regexp="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$",message="Password should of 8 characters and should contain # : 502")
	private String password;
	
	@NotBlank(message="Qualification must not be blank : 603")
	private String qualification;
	
	@NotBlank(message="EmailId must not be blank : 604")
	@Email(message="Email should be in correct format : 503")
	private String emailId;
	
	@Range(min=1,message="Contact should not be blank : 605")
	private long contact;
	
	private LocalDate dateOfBirth;
	
	@NotBlank(message="ApplyType must not be blank : 506")
	private String applyType;
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String citizenship;
	
	@NotBlank(message="Gender must be select : 608")
	private String gender;
	
	@NotBlank(message="hintQuestion must not be blank : 606")
	private String hintQuestion;
	
	@NotBlank(message="hintAnswer must not be blank : 607")
	private String hintAnswer;
	
	
}
