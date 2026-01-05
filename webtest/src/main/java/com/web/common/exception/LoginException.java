package com.web.common.exception;

import java.time.LocalDateTime;

import lombok.Getter;
@Getter
public class LoginException extends RuntimeException {
	private LocalDateTime time;
	public LoginException(String msg, LocalDateTime time) {
		super(msg);
		this.time=time;
	}
	
}
