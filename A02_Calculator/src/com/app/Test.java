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
	
	public static void main(String[] args) {
		Test t=new Test();
		t.addition();
		
		t.substraction();
				
	}
}
