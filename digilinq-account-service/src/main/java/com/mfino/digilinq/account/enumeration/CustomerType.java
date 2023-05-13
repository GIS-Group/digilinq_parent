/**
 *
 */
package com.mfino.digilinq.account.enumeration;

/**
 * @author Krishna
 *
 */
public enum CustomerType {

	/** The Enterprise Customer. */
	Enterprise_Customer("Enterprise Customer"),
	/** The Retail Customer. */
	Retail_Customer("Retail Customer");

	/** The value. */
	private String value;

	/**
	 * Constructor method.
	 *
	 * @param value the value
	 */
	CustomerType(String value) {
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
