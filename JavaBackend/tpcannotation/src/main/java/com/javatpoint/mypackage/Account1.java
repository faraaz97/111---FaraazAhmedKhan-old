package com.javatpoint.mypackage;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity  
@Table(name = "account")  
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)  
  
public class Account1 {  
@Id  
@GeneratedValue(strategy=GenerationType.AUTO)  
      
@Column(name = "id")  
private int id;  
@Column(name= "accountid")
private int accountid;
  
@Column(name = "accountname")  
private String accountname;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getAccountid() {
	return accountid;
}

public void setAccountid(int accountid) {
	this.accountid = accountid;
}

public String getAccountname() {
	return accountname;
}

public void setAccountname(String accountname) {
	this.accountname = accountname;
}


} 
