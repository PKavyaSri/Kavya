package No.OfOcc;

import java.util.*;
import java.util.Map.Entry;

public class NoOfWordsString {

	public static void countWords(String cl[])
	{

		Map<String,Integer> map =new LinkedHashMap<String,Integer>();
		for(String s1:cl)
		{
			if(map.containsKey(s1))
			{
				map.put(s1,map.get(s1)+1);
			}
			else
			{
				map.put(s1, 1);
			}
		}
		//System.out.println(map);
		
		for(Map.Entry<String,Integer> e:map.entrySet())
		{
			if(e.getValue()>1)
			{
			System.out.println(e.getKey()+" "+e.getValue());
			
			}
		}
	}
	public static void main(String[] args) {
	
		String colors = "red,blue,green,red,blue,orange,blue,red";
		String cl[] =colors.split(",");
		countWords(cl);

	}

}
