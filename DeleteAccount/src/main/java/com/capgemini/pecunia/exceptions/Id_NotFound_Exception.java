package com.capgemini.pecunia.exceptions;
public class Id_NotFound_Exception extends Exception{
	public Id_NotFound_Exception(String errorMsg){
		super(errorMsg);
		System.out.println("id does not exist");
	}
}
