package ReplaceInString;

import java.util.Arrays;

public class ReplaceAlphabetInString {

	public static void replace(String s,int n)
	{
		String s1[]=s.split("");
		
		for(int i=0;i<n;i++)
		{
			if(Character.isAlphabetic(s.charAt(i)))
			{
				s1[i]="%20";
			}
		}
		System.out.println(Arrays.toString(s1));
	}
	public static void main(String[] args) {
		String s="java123is456prog7lang8*";
		int n=s.length();
		replace(s,n);
	}

}
