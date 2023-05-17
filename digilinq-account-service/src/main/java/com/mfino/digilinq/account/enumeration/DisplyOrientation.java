package com.mfino.digilinq.account.enumeration;

public enum DisplyOrientation {
    LTR("ltr"),
    RTL("rtl");

	/** The value. */
	private String value;

	/**
	 * Constructor method.
	 *
	 * @param value the value
	 */
	DisplyOrientation(String value) {
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
