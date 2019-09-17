package No.OfOcc;
import java.util.*;
import java.util.Map;

public class NoOfCharInEachWord {
	
	public static void countOfChar(String s[])
	{
    	Map<String,Map<Character,Integer>> M1 = new LinkedHashMap<>();
		for(String st : s)
		{
			char[] ch =st.toCharArray();
		 Map<Character,Integer> M2 = new LinkedHashMap<>();
			for(char c:ch)
			{
				if(M2.containsKey(c))
				{
					M2.put(c, M2.get(c)+1);
				}
				else
				{
					M2.put(c,1);
				}
				M1.put(st,M2);
			}	
		}
		System.out.println(M1);
		
				
	}

	public static void main(String[] args) {
		String[] s = {"racecar","abcdecac","override","madam"};
		countOfChar(s);

	}

}
