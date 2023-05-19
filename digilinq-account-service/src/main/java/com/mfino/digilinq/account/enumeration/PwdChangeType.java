package com.mfino.digilinq.account.enumeration;

/**
 * 
 * @author Krishna
 *
 */
public enum PwdChangeType {

	/** The Enterprise Customer. */
	FOR_GOT("ForGot"),
	/** The Retail Customer. */
	RESET("Reset");

	/** The value. */
	private String value;

	/**
	 * Constructor method.
	 *
	 * @param value the value
	 */
	PwdChangeType(String value) {
		this.value = value;
	}

	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return this.value;
	}
}
