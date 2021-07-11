package com.marianna.todo.service.exception;

public class ObjectNotFoundexception extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ObjectNotFoundexception(String message, Throwable cause) {
		super(message, cause);
	}

	public ObjectNotFoundexception(String message) {
		super(message);
	}

}
