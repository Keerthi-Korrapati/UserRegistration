package com.example.demo.Exception;

public class EmailNotFoundException extends RuntimeException{
	
	public EmailNotFoundException(String msg) {
		super(msg);
	}

}
