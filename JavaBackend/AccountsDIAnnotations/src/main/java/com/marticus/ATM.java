package com.marticus;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("atm")
@Scope("prototype")
public class ATM {
	
	public void atmWithdraw() {
		System.out.println("The amount has been withdrawn from the ATM machine ");
	}

}
