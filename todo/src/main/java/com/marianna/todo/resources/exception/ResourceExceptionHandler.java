package com.marianna.todo.resources.exception;

import javax.servlet.ServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.marianna.todo.service.exception.ObjectNotFoundexception;

@ControllerAdvice
public class ResourceExceptionHandler {

	@SuppressWarnings("unused")
	@ExceptionHandler(ObjectNotFoundexception.class)
	public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundexception e, ServletRequest request)
	{
		StandardError error = new StandardError(System.currentTimeMillis(), HttpStatus.NOT_FOUND.value(), e.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
		
	}
}
