package Array;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class palindrome {

	public static void palindrome(String s)
	{
		char c[] =s.toCharArray();
		boolean isExist=true;
		System.out.println((c.length/2));
		for(int i=0;i<c.length/2;i++)
		{
			if(c[i]==c[(c.length-1)-i])
			{
				continue;
			}
			else
			{
				System.out.println("String is not palindrome");
				isExist =false;
				break;
			}
		}
		count(c,isExist);
	}
	
	public static void count(char[] c,boolean isExist)
	{
		Map<Character,Integer> m =new HashMap<Character,Integer>();
		for(char ch:c)
		{
			if(m.containsKey(ch))
			{
				m.put(ch, m.get(ch)+1);
			}
			else
			{
				m.put(ch, 1);
			}
		}
		
		if(isExist==true)
		{
			System.out.println("String is palindrome");
			System.out.println(m.get(c[0]));
		}
		else
		{
			for(Map.Entry<Character,Integer> e:m.entrySet())
			{
				Integer max=Collections.max(m.values());
				if(e.getValue()==max)
				{
					System.out.println(e.getKey()+" "+e.getValue());
				}
			}
		}
	}
	public static void main(String[] args) {
		
		String s = "madam";
		palindrome(s);
				

	}

}
