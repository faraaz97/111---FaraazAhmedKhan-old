package com.marticus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("SaveAccount")
@Scope("prototype")
public class SavingsAccount {
	
	@Autowired
	private CurrentAccount currentaccount;
	
	
	public CurrentAccount getCurrentaccount() {
		return currentaccount;
	}
	public void setCurrentaccount(CurrentAccount currentaccount) {
		this.currentaccount = currentaccount;
	}
	public void saveAccount() {
		System.out.println("This is the savings account");
	}

}
