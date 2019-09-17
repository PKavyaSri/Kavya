package Abstraction;

public class B  extends A{
		void message()
		{
		System.out.println("B is called");
		
		}
		void display()
		{
		message();
		super.message();
		}
	

	public static void main(String[] args) {
		
        B b =new B();
        b.display();
        A a =new B();
        a.message();
        a.m1();
	}

}


