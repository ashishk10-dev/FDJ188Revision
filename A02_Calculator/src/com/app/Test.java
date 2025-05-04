package com.app;

public class Test {
	int x=18;
	int y=20;
	
	public void addition()
	{
		
		int z=x+y;
		System.out.println("x + y : "+z);
	}
	
//Substraction Method
	public void substraction()
	{
		
		int z=x-y;
		System.out.println("x - y : "+z);
	}
	
//Division
	public void multiplication()
	{
		int z=x*y;
		System.out.println("x * y : "+z);
	}

//Multiplication
	public void division()
	{
		int z=x/y;
		System.out.println("x / y : "+z);
	}
	
//Multiplication2
	public void Multiplication2()
	{
		int z=x*y*x;
		System.out.println("x * y * x : "+z);
	}

	
	public static void main(String[] args) {
		Test t=new Test();
		t.addition();
		
		t.substraction();
		
		t.division();
				
	}

//redBus
	public void redBus()
	{
		System.out.println("This Is Red Bus");
		System.out.println("This Is Red Bus");
		
	}
	
}
