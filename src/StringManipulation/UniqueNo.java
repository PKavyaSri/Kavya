package StringManipulation;

import java.util.*;

public class UniqueNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String unique = "KavyaSri";

		char[] ch = unique.toCharArray();
		Set <Character> set = new HashSet<Character>();
		for(char c :ch)
		{
			if(set.add(c)== true)
			{
				System.out.println("The unique elements in a string are :"+c);
			}
		}
	}

}
