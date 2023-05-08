package com.mfino.digilinq.account.controller;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * This class represents BaseRestApiResponse.java
 * 
 * @author Krishna 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseRestApiResponse implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 2465779250438665359L;

	/** The success. */
	private boolean success = true;

	/** The message. */
	private String message;

	/**
	 * Gets the message.
	 *
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Sets the message.
	 *
	 * @param message the new message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * Instantiates a new base rest api response.
	 */
	public BaseRestApiResponse() {
		this.message = "Operation Completed Successfully";
		this.success = true;
	}

	/**
	 * Instantiates a new base rest api response.
	 *
	 * @param message the message
	 * @param success the success
	 */
	public BaseRestApiResponse(String message, boolean success) {
		super();
		this.message = message;
		this.success = success;
	}

	/**
	 * Instantiates a new base rest api response.
	 *
	 * @param success the success
	 * @param message the message
	 */
	public BaseRestApiResponse(boolean success, String message) {
		super();
		this.message = message;
		this.success = success;
	}

	/**
	 * Checks if is success.
	 *
	 * @return true, if is success
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * Sets the success.
	 *
	 * @param success the new success
	 */
	public void setSuccess(boolean success) {
		this.success = success;
	}

}
