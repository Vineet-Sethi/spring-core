package com.learning.spring.conf;

import org.springframework.beans.factory.annotation.Autowired;

public class Samsung 
{
	@Autowired
	private MobileProcessor processor;
	
	public void config()
	{
		System.out.println("Octa Core, 6GB RAM, 13MP Camera");
		processor.process();
	}
}
