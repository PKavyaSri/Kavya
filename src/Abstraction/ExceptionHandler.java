package Abstraction;

public class ExceptionHandler {
	
		public static void main(String args[]){  
		  try{  
		   String a= "";
				   //data=25/0;  
		   System.out.println(a.length());  
		  }  
		  catch(ArithmeticException e)
		  {
			  System.out.println(e);
		   } 
		  catch(NullPointerException e)
		  {
			  System.out.println(e);
		   }
		  catch(Exception e)
		  {
			  System.out.println(e);
		   }
		  finally
		  {
			  System.out.println("finally block is always executed");
		  }  
		  System.out.println("rest of the code...");  
		  }  

}
