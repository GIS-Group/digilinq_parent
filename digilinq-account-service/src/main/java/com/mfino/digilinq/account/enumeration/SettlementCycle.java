package com.mfino.digilinq.account.enumeration;

public enum SettlementCycle {
	
	MONTHLY("Monthly"),
	QUARTERLY("Quarterly"),
	HALFYEARLY("Halfyearly"),
	YEARLY("Yearly"); 
	/** The value. */
	private String value;

	/**
	 * Constructor method.
	 *
	 * @param value the value
	 */
	SettlementCycle(String value) {
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
