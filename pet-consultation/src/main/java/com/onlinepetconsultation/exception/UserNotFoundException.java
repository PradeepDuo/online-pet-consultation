package com.onlinepetconsultation.exception;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class UserNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	private String message="Admin not present";
	
	public String getMessage() {
		return message;
	}
	
}
