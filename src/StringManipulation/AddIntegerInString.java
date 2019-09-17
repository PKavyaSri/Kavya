package StringManipulation;

public class AddIntegerInString {

	public static void main(String[] args) {
	String s = "abc123%^def45gh6i7";
	int sum=0;
	String s1 ="";
	
	for(int i=0;i< s.length();i++)
	{
		if(Character.isDigit(s.charAt(i)))
		{
			s1=s1+s.charAt(i);
			if(i==s.length()-1)
			{
				sum=sum+Integer.parseInt(s1);
			} 
		}
		else if(!s1.equals(""))
		{
			sum=sum+Integer.parseInt(s1);
			s1="";
		}
	}
	System.out.println(sum);
	}
}
