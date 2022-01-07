package com.javatpoint.mypackage;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
//@Table(name="currentaccount2")
@PrimaryKeyJoinColumn(name="ID")  

public class CurrentAccount2 extends Account2{
	
	@Column(name="overDraftAccount")
	private double overDraftAccount;

	public double getOverDraftAccount() {
		return overDraftAccount;
	}

	public void setOverDraftAccount(double overDraftAccount) {
		this.overDraftAccount = overDraftAccount;
	}
	
	

}
