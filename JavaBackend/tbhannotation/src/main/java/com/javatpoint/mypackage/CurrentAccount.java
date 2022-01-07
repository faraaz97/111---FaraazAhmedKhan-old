package com.javatpoint.mypackage;  
  
import javax.persistence.*;  
  
@Entity  
@DiscriminatorValue("currentaccount")  
public class CurrentAccount extends Account{  
      
@Column(name="overDraftAmount")    
private Double overdraftamount;  
  


public double getoverDraftAmount() {
	return overdraftamount;
}

public void setoverDraftamount(Double overdraftamount) {
	this.overdraftamount = overdraftamount;
}


}
