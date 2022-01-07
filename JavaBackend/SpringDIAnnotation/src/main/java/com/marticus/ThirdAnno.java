package com.marticus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ThirdAnno")
@Scope("prototype")

public class ThirdAnno {
	@Autowired
	private Fourth fourth;
	
	public Fourth getFourth() {
		return fourth;
	}

	public void setFourth(Fourth fourth) {
		this.fourth = fourth;
	}

	public void helloThird() {
		System.out.println("This is injected from second bean");
		System.out.println("...................................................");
	}

}
