package com.javatpoint.mypackage;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="CurrentAccount1")
@AttributeOverrides({
     @AttributeOverride(name="id", column=@Column(name="id")),
     @AttributeOverride(name="accountname", column=@Column(name="accountname")),
     @AttributeOverride(name="accountid", column=@Column(name="accountid"))
})
public class CurrentAccount1 extends Account1{
	
	@Column(name="overDraftAmount")
	private double overDraftAmount;

	public double getOverDraftAmount() {
		return overDraftAmount;
	}

	public void setOverDraftAmount(double overDraftAmount) {
		this.overDraftAmount = overDraftAmount;
	}
	

}
