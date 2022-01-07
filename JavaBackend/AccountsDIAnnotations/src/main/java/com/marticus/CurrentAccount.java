package com.marticus;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("curAccount")
@Scope("prototype")
public class CurrentAccount {
	public void crntAccount() {
		System.out.println("This is the current account");
	}

}
