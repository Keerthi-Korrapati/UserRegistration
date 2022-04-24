package com.example.demo.Exception;

public class ContactNotFoundException extends RuntimeException{
	public ContactNotFoundException(String msg) {
		super(msg);
	}

}
