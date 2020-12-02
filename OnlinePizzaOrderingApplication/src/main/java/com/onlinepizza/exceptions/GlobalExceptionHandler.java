package com.onlinepizza.exceptions;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(value = CustomerIdNotFoundException.class)
	public ResponseEntity<Object> handleNotFoundException(CustomerIdNotFoundException e, WebRequest webRequest) {

		ErrorDetails error = new ErrorDetails(new Date(), e.getMessage(), webRequest.getDescription(false));

		return new ResponseEntity<Object>(error, HttpStatus.NOT_FOUND);
	}

}
