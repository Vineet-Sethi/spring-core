package com.learning.spring.conf.rmv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung 
{
	@Autowired
	@Qualifier("mediaTek")
	private MobileProcessor processor;
	
	public void config()
	{
		System.out.println("Octa Core, 6GB RAM, 13MP Camera");
		processor.process();
	}
}
