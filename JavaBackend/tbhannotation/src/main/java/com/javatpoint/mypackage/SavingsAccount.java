package com.javatpoint.mypackage;  
  
import javax.persistence.Column;  
import javax.persistence.DiscriminatorValue;  
import javax.persistence.Entity;  
  
@Entity  
@DiscriminatorValue("savingsaccount")  
public class SavingsAccount extends Account{  
      
    @Column(name="interest")  
    private Double interest;  
      
   

	public double interest() {
		return interest;
	}

	public void setInterest(Double interest) {
		this.interest = interest;
	}

		}
