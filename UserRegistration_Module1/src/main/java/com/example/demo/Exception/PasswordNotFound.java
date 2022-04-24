package com.example.demo.Exception;

public class PasswordNotFound extends RuntimeException{
	public PasswordNotFound(String msg) {
		super(msg);
	}
}
