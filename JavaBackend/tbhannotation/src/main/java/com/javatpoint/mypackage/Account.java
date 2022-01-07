package com.javatpoint.mypackage;  
import javax.persistence.*;  
  
@Entity  
@Table(name = "account")  
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)  
@DiscriminatorColumn(name="type",discriminatorType=DiscriminatorType.STRING)  
@DiscriminatorValue(value="account")  
  
public class Account {  
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

public int getaccountId() {
	return id;
}

public void setaccountId(String Id) {
	this.id = accountid;
}
public String getName() {
	return accountname;
}

public void setName(String name) {
	this.accountname = name;
}   
}
