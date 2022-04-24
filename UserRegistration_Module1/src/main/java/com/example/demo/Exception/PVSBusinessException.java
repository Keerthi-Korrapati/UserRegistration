package com.example.demo.Exception;


import java.util.HashMap;  
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class PVSBusinessException extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(NameNotFoundException.class)
	public ResponseEntity<PVSException> resourceNotFound(NameNotFoundException ex){
		PVSException response =new PVSException();
		response.setErrorCode("NOT_FOUND");
		response.setErrorMessage(ex.getMessage());
		return new ResponseEntity<PVSException>(response, HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(PasswordNotFound.class)
	public ResponseEntity<PVSException> passwordNotFound(PasswordNotFound ex){
		PVSException response =new PVSException();
		response.setErrorCode("NOT_FOUND");
		response.setErrorMessage(ex.getMessage());
		return new ResponseEntity<PVSException>(response, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(QualificationNotFoundException.class)
	public ResponseEntity<PVSException> qualificationNotFoundException(QualificationNotFoundException ex){
		PVSException response =new PVSException();
		response.setErrorCode("NOT_FOUND");
		response.setErrorMessage(ex.getMessage());
		return new ResponseEntity<PVSException>(response, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(EmailNotFoundException.class)
	public ResponseEntity<PVSException> emailNotFoundException(EmailNotFoundException ex){
		PVSException response =new PVSException();
		response.setErrorCode("NOT_FOUND");
		response.setErrorMessage(ex.getMessage());
		return new ResponseEntity<PVSException>(response, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(ContactNotFoundException.class)
	public ResponseEntity<PVSException> contactNotFoundException(ContactNotFoundException ex){
		PVSException response =new PVSException();
		response.setErrorCode("NOT_FOUND");
		response.setErrorMessage(ex.getMessage());
		return new ResponseEntity<PVSException>(response, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(HintQueNotFoundException.class)
	public ResponseEntity<PVSException> hintQueNotFoundException(HintQueNotFoundException ex){
		PVSException response =new PVSException();
		response.setErrorCode("NOT_FOUND");
		response.setErrorMessage(ex.getMessage());
		return new ResponseEntity<PVSException>(response, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(HintAnsNotFoundException.class)
	public ResponseEntity<PVSException> hintAnsNotFoundException(HintAnsNotFoundException ex){
		PVSException response =new PVSException();
		response.setErrorCode("NOT_FOUND");
		response.setErrorMessage(ex.getMessage());
		return new ResponseEntity<PVSException>(response, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(GenderNotFoundException.class)
	public ResponseEntity<PVSException> genderNotFoundException(GenderNotFoundException ex){
		PVSException response =new PVSException();
		response.setErrorCode("NOT_FOUND");
		response.setErrorMessage(ex.getMessage());
		return new ResponseEntity<PVSException>(response, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(DOBNotFoundException.class)
	public ResponseEntity<PVSException> dobNotFoundException(DOBNotFoundException ex){
		PVSException response =new PVSException();
		response.setErrorCode("NOT_FOUND");
		response.setErrorMessage(ex.getMessage());
		return new ResponseEntity<PVSException>(response, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(ApplyTypeNotFoundException.class)
	public ResponseEntity<PVSException> applyTypeNotFoundException(ApplyTypeNotFoundException ex){
		PVSException response =new PVSException();
		response.setErrorCode("NOT_FOUND");
		response.setErrorMessage(ex.getMessage());
		return new ResponseEntity<PVSException>(response, HttpStatus.NOT_FOUND);
	}
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		Map<String, String> errors = new HashMap<>();
		ex.getBindingResult().getAllErrors().forEach((error) -> {
			String fieldName = ((FieldError) error).getField();
			String message = error.getDefaultMessage();
			errors.put(fieldName, message);
		});

		return new ResponseEntity<Object>(errors, HttpStatus.BAD_REQUEST);
	}

}
