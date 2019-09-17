package No.OfOcc;

import java.util.*;
import java.util.Map.*;
public class noOfRepWordsInString {

	public static void main(String[] args) {
		String s = "kavyasri";
		char c[] =s.toCharArray();
		int n = c.length;
		System.out.println("no.of Characters in String "+n);
		
		String s1= "kavya sri hello hello sri world";
		String st[] =s1.split(" ");
		System.out.println("No.of Repeated words: "+noOfWordsString(st,n));
		

	}

	public static int noOfWordsString(String[] st, int n) {
		
		int count =0;
		Map<String,Integer> map = new HashMap<String,Integer>();
		for(String s2:st)
		{
			if(map.containsKey(s2))
			{
				map.put(s2,map.get(s2)+1);
			}
			else
			{
				map.put(s2, 1);
			}
		}
		for(Entry<String,Integer> e : map.entrySet())
		{
			if(e.getValue()>=1)
			{
				//System.out.println(e.getKey()+" "+e.getValue());
				count++;
			}
		}
		return count;
		
		
	}

}

