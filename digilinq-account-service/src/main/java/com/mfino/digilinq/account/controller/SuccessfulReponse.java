package com.mfino.digilinq.account.controller;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * This class represents SuccessfulReponse.java
 * 
 * @author Krishna
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SuccessfulReponse<T> extends BaseRestApiResponse {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1791141474295931098L;

	/** The response. */
	private T response;

	/**
	 * Instantiates a new successful reponse.
	 *
	 * @param response the response
	 */
	public SuccessfulReponse(T response) {
		super();
		this.response = response;
	}

	/**
	 * Instantiates a new successful reponse.
	 *
	 * @param message  the message
	 * @param response the response
	 */
	public SuccessfulReponse(String message, T response) {
		super(message, true);
		this.response = response;
	}

	/**
	 * Gets the response.
	 *
	 * @return the response
	 */
	public Object getResponse() {
		return response;
	}

	/**
	 * Instantiates a new successful reponse.
	 *
	 * @param message the message
	 * @param success the success
	 */
	public SuccessfulReponse(String message, boolean success) {
		super(message, success);
	}

	/**
	 * Instantiates a new successful reponse.
	 *
	 * @param message  the message
	 * @param success  the success
	 * @param response the response
	 */
	public SuccessfulReponse(String message, boolean success, T response) {
		super(message, success);
		this.response = response;
	}
}
