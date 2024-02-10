package com.user.service.UserService.exception;

public class ResourceNotFound extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public ResourceNotFound() {
		super("Resource not found on server !!");
	}
	
	public ResourceNotFound(String message) {
		super(message);
	}

}
