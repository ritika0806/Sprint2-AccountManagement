package com.capgemini.pecunia.exception;

@SuppressWarnings("serial")
public class IdAlreadyExistsException extends Exception {
	public  IdAlreadyExistsException(String errorMsg){
		super(errorMsg);
	}
}