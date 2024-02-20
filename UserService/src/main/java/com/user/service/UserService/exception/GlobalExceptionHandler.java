package com.user.service.UserService.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.user.service.UserService.payload.ApiResponse;
import com.user.service.UserService.exception.ResourceNotFound;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResourceNotFound.class)
	public ResponseEntity<ApiResponse> handlerResourceNotFoundHandler(ResourceNotFound ex) {
		String msg = ex.getMessage();
		
		ApiResponse response = ApiResponse.builder().message(msg).success(true).status(HttpStatus.NOT_FOUND).build();
				return new ResponseEntity<ApiResponse>(response, HttpStatus.NOT_FOUND);
	}

}
