package com.shinu.LamdasDemo1;

public interface Greeter 
{
	public void perform();
}

class HelloWorldGreeting implements Greeter
{
	@Override
	public void perform() 
	{
		System.out.println("HellowWorld!");
		
	}
	
}
