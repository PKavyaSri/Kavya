package No.OfOcc;

import java.util.*;
import java.util.Map.*;

public class NoOccuKTimes {
	
	public static char OccuKTimes(char c[],int k)
	{
		int count=0;
		Map<Character,Integer> m = new HashMap<Character,Integer>();
		for(char c1: c)
		{
			if(m.containsKey(c1))
			{
				m.put(c1, m.get(c1)+1);
			}
			else
			{
				m.put(c1, 1);
			}
		}
		
		for(Entry<Character,Integer> e : m.entrySet())
		{
			
			if(e.getValue()==k)
			{
				return e.getKey();
				//count++;
			}
		}
		
		return 'z';
		
	}

	public static void main(String[] args) {
		char c[] = {'a','b','b','c','d'};
		//String c = "This is sample string to count the strings";
		int n=c.length;
		//String s[]=c.split(" ");
		//int n=s.length;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter K value");
		int k= sc.nextInt();
		System.out.println(OccuKTimes(c,k));
		

	}

}
