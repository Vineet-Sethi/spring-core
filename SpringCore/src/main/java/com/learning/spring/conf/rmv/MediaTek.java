package com.learning.spring.conf.rmv;

import org.springframework.stereotype.Component;

@Component
public class MediaTek implements MobileProcessor 
{
	public void process()
	{
		System.out.println("And with the fastest multi core processor...");
	}
}
