package com.mfino.digilinq.account.enumeration;

public enum StatusType {

	/** The Active. */
	ACTIVE("Active"),
	/** The InActive. */
	IN_ACTIVE("InActive"),
	/** The Pending Approval. */
	PENDING_APPROVAL("Pending Approval");

	/** The value. */
	private String value;

	/**
	 * Constructor method.
	 *
	 * @param value the value
	 */
	StatusType(String value) {
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
