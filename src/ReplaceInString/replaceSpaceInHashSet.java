package ReplaceInString;

import java.util.*;

public class replaceSpaceInHashSet {

	public static void main(String[] args) {
		String s[] ={"java is a programming language","It is raining","is raining it","language is a programming java"};
		String s1 ="java is a programming language ";
		hashSet(s);
		hashSet(s1);
	}

	public static void hashSet(String[] s) {
		Set<String> Hset = new LinkedHashSet<String>(Arrays.asList(s));
		Hset.clear();
		
		for(int i=0;i<s.length;i++)
		{
			 String s1= s[i].replaceAll(" ", "%20");
			Hset.add(s1);
		}
		
					System.out.println(Hset);
			
	}
	
	public static void hashSet(String s1) {
		Set<String> Hset = new HashSet<String>(Arrays.asList(s1));
		Hset.clear();
		for(int i=s1.length()-1;i>=0;i--)
		{
			String s2= s1.replaceAll(" ", "%20");
			Hset.add(s2);
		}
		
					System.out.println(Hset);
			
	}


}
