package com.mfino.digilinq.account.controller;

public class BaseAPIController {

	/**
	 * Gets the sucess response.
	 *
	 * @param <T>      the generic type
	 * @param response the response
	 * @return the sucess response
	 */
	public <T> Object getSucessResponse(T response) {
		return new SuccessfulReponse(response);
	}

	/**
	 * Gets the sucess response.
	 *
	 * @param <T>      the generic type
	 * @param message  the message
	 * @param response the response
	 * @return the sucess response
	 */
	public <T> Object getSucessResponse(String message, T response) {
		return new SuccessfulReponse(message, response);
	}
}
