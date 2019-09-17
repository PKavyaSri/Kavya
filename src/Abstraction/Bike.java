package Abstraction;

public abstract class Bike {
	static int n=10;
	String s="Hello";
	
	Bike()
	{
		System.out.println("The bike should be on black colour");
	}
	
	void message()
	{
		System.out.println("message from parent class");
	}
	public static void hault()
    {
   	 System.out.println("bike stopped to run");
    }
	 abstract void run();
	
	final void m1()
	 {
		 System.out.println("this is final");
	 }
	
	
}
