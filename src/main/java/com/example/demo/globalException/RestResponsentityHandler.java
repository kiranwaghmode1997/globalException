package com.example.demo.globalException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@ResponseStatus
public class RestResponsentityHandler extends ResponseEntityExceptionHandler{
	
	
	@ExceptionHandler(NotEligibleForVoteException.class)
	public ResponseEntity<ErrorMessage> invalidAgeException(NotEligibleForVoteException ex,WebRequest request){
		ErrorMessage msg=new ErrorMessage(HttpStatus.BAD_REQUEST,ex.getMessage());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(msg);
	}
	
	
	
	@ExceptionHandler(NotEmptyNameException.class)
	public ResponseEntity<ErrorMessage> invalidAgeException(NotEmptyNameException ex,WebRequest request){
		ErrorMessage msg=new ErrorMessage(HttpStatus.BAD_REQUEST,ex.getMessage());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(msg);
	}

}
