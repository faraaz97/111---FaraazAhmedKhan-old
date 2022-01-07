package com.javatpoint.mypackage;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="SavingsAccount")
@AttributeOverrides({  
    @AttributeOverride(name="id", column=@Column(name="id")),  
    @AttributeOverride(name="accountname", column=@Column(name="accountname")), 
    @AttributeOverride(name="accountid", column=@Column(name="accountid"))
})  
public class SavingsAccount1 extends Account1{
	
	@Column(name="Interest")
	private double Interest;

	public double getInterest() {
		return Interest;
	}

	public void setInterest(double interest) {
		Interest = interest;
	}

}
