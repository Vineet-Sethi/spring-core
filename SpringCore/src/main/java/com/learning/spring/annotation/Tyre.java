package com.learning.spring.annotation;

import org.springframework.stereotype.Component;

@Component
public class Tyre 
{
	@Override
	public String toString() 
	{
		return "has 4 tyres...";
	}
}
