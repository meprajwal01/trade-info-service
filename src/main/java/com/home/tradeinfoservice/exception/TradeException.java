package com.home.tradeinfoservice.exception;

import java.time.LocalDateTime;

public class TradeException {

	private String message;
	private LocalDateTime localDateTime;
	private String description;

	public TradeException() {
	}

	public TradeException(String message, LocalDateTime localDateTime, String description) {
		super();
		this.message = message;
		this.localDateTime = localDateTime;
		this.description = description;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
