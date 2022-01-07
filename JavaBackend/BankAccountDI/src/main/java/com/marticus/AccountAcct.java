package com.marticus;

public class AccountAcct {
	private Account acct;

	public Account getAcct() {
		return acct;
	}

	public void setAcct(Account acct) {
		this.acct = acct;
	}
	public void AccountDetails() {
		acct.withDrawMoney();
	}

}
