package No.OfOcc;

import java.util.*;

public class FirstRepetitiveChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abbcddeff";
		firstRepetitiveChar(s);
		//firstRepetitiveChar2(s);
		
		

	}

	private static void firstRepetitiveChar2(String s) {
		char[] ch =s.toCharArray();
		int count=0;
		for(int i=0;i<ch.length-1;i++)
		{
			if(ch[i]==ch[i+1])
			{		
				count++;
				System.out.println(ch[i++]);
				break;
				}
			
			}
		
			
		}
		
	private static void firstRepetitiveChar(String s) {
		char[] ch =s.toCharArray();
		int count=1;
		Set <Character> set = new HashSet<Character>();
		for(char c:ch)
		{
			if(set.contains(c))
			{
				count++;
				System.out.println(c);
				break;
				
			}
			else
			{
				set.add(c);
			}
				
				
		}
		//return '\0';
		
		
	}

}
