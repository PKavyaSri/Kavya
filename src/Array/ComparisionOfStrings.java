package Array;
import java.util.*;

public class ComparisionOfStrings {

	public static void ComStrings(String s1,String s2)
	{
		String s[] = s1.split(" ");
		String st2[] =s2.split(" ");
		List <String> l = new ArrayList<String>(Arrays.asList(s));
		for(int i=0;i<st2.length;i++)
		{
			if(l.contains(st2[i]))
			{
				l.remove(st2[i]);
			}
			else
			{
				l.add(st2[i]);
			}
				
		}
		if(l.isEmpty())
		{
			System.out.println("String s1 is similar to s2");
		}
		else {
			System.out.println("Strings are not equal");
		}
		
		
	}
	public static void main(String[] args) {
	
		String s1= "Java is programming language ";
		String s2= "Java is programming language ";
		
		ComStrings(s1,s2);

	}

}
