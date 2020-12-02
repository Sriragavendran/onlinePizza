package com.onlinepizza.exceptions;

public class OrderIdNotFoundException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OrderIdNotFoundException(Integer bookingOrderId) {
		super(bookingOrderId + " Not Found");


	}
}
