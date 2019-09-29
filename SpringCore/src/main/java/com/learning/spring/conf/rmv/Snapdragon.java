package com.learning.spring.conf.rmv;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements MobileProcessor 
{
	public void process()
	{
		System.out.println("And with state of the art Snapdragon processor...");
	}
}
