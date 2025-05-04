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

//m1
	public void m1()
	{
		System.out.println("I am M1()");
	}

//m2 Dev4
	public void m2()
	{
		System.out.println("I am M2()");
	}
	
//m3 Dev5
	public void m5()
	{
		System.out.println("i am m5()");
	}
	
	
	public static void main(String[] args) {
		Test t=new Test();
		t.addition();
		
		t.substraction();
		
		t.division();
				
	}


	
}
