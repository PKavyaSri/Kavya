package StringManipulation;

import java.util.*;
public class UniqueStrings {

	public static void main(String[] args) {
		
		String s1[] = {"Hello","World","Java","Hello"};
		List <String> list = new ArrayList<String>(Arrays.asList(s1));
		
		List<String> list2 =new ArrayList<String>();
		for(String s:list)
		{
			if(list2.contains(s))
			{
				continue;
			}
			else
			{
				list2.add(s);
			}
		}
		Collections.sort(list2);
		System.out.println(list2);
		
		

	}

}
