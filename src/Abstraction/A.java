package Abstraction;

public class A {
	
	void message()
	{
		System.out.println("A is called");
	}
	void m2()
	{
		System.out.println("m2");
	}
	
	void m1()
	{
		System.out.println("m1");
		this.m2();
	}

}
