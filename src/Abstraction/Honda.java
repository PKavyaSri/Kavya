package Abstraction;

public class Honda extends Bike{
	
		 void run()
	{
		System.out.println("Running Safley");
	}

		static void m2()
		{
			System.out.println("");
			
			System.out.println();
		}
		public static void hault()
	    {
	   	 System.out.println("Honda stopped to run");
	    }
		void message()
		{
			System.out.println("message from Child class");
		}
		void display()
		{
			message();
			System.out.println("hello");
			super.message();
		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike ob =new Honda();
		ob.run();
		ob.hault();
		
		System.out.println(n);
		m2();
		Honda h=new Honda();
		h.hault();
		ob.message();
		
	}

}
