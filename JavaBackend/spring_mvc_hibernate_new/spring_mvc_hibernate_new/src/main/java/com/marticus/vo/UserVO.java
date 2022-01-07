package com.marticus.vo;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class UserVO {
	
	private static final long serialVersionUID = 1L;
	 
	int id;
	 
	private String usersName;
 
	private String usersEmail;
	 
	public String getUsersEmail() {
		return usersEmail;
	}

	public void setUsersEmail(String usersEmail) {
		this.usersEmail = usersEmail;
	}

	private int usersAge;

}
