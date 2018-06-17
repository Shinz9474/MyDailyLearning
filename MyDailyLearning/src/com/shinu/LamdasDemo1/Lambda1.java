package com.shinu.LamdasDemo1;

public  class Lambda1 
{
	public void greet(Greeter greetings)
	{
		//prints the greeting message
		greetings.perform();
	}

	public static void main(String[] args) 
	{
		Lambda1 lambda = new Lambda1();
		
		System.out.println("Without using lambdas");
		Greeter greetings = new HelloWorldGreeting();
		greetings.perform();
		lambda.greet(greetings);
		
		System.out.println("Without using lambdas");
		Greeter lambdaGreetings = () -> System.out.println("Hello World!");
		lambdaGreetings.perform();
		
		lambda.greet(lambdaGreetings);
	}

}


