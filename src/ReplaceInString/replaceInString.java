package ReplaceInString;

import java.util.*;

public class replaceInString {

	public static void main(String[] args) {
		String a="Java is a programming language";
		String s1[]=a.split(" ");
		System.out.println(Arrays.toString(s1));
		/*String s="";
		for(int i=0;i<a.length();i++)
		{
			s=a.replace(" ", "%20");
		}
		
		System.out.println(s);*/
		int n = s1.length;
		System.out.println(Arrays.toString((replaceInString(s1,n))));

	}

	public static String[] replaceInString(String[] s1,int n)
	{
		int j=0;
		s1=Arrays.copyOf(s1, n+(n-1));
		//System.out.println(s1.length);
		int newLength =s1.length-1;
		for(int i=n-1;i>=0;i--)
		{
			s1[newLength--]= s1[i];
			if(i!=0)
			{
				s1[newLength--]="%20";
			}
		}
		return s1;
	
    }
 }
