package com.journaldev.spring.exceptions;

public class ArrayIndexOutOfBoundException extends Exception{
	
	public ArrayIndexOutOfBoundException(int id){
		super("ArrayOutOfBoundException with id="+id);
	}

}
