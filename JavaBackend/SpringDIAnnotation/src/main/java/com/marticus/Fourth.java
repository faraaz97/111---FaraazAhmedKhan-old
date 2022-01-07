package com.marticus;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("FourthAnno")
@Scope("prototype")
public class Fourth {
	public void helloFourth()
	{
		System.out.println("Com'on this is injected from third bean");
	}

}
