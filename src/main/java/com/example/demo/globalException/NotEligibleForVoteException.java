package com.example.demo.globalException;

public class NotEligibleForVoteException extends RuntimeException {

	public NotEligibleForVoteException() {
		super();
	}

	public NotEligibleForVoteException(String message) {
		super(message);
	}


}
