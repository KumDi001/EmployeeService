package com.local.employeeservice.exceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.local.employeeservice.exceptions.EmployeeAlreadyExistsException;
import com.local.employeeservice.exceptions.EmployeeNotFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler({ EmployeeNotFoundException.class })
	public ResponseEntity<Object> handleEmployeeNotFoundException(EmployeeNotFoundException exception) {
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
				.body(exception.getMessage());
	}

	@ExceptionHandler({ EmployeeAlreadyExistsException.class })
	public ResponseEntity<Object> handleEmployeeAlreadyExistsException(EmployeeAlreadyExistsException exception) {
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
				.body(exception.getMessage());
	}

	@ExceptionHandler({ RuntimeException.class })
	public ResponseEntity<Object> handleRuntimeException(RuntimeException exception) {
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
				.body(exception.getMessage());
	}
}
