package No.OfOcc;

import java.util.*;
import java.util.Map.Entry;

public class dupCharInString {

	public static void main(String[] args) {
		
		String str = "addfcf";
		char []ch =str.toCharArray();
		Arrays.sort(ch);
		int count =0;
		
		//Method 1
		/*for(int i=0;i<ch.length-1;i++)
		{
			for(int j=i+1;j<ch.length-1;j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println(ch[j]);
				
				}
			}		
		} */
		//method2
		Arrays.sort(ch);
		System.out.println(ch.length);
		
		for(int i=0;i<ch.length-1;i++)
		{
			//int j=i+1;
			if(ch[i]==ch[i+1])
				{
					ch[count++]=ch[i];			
				
				}
		}
		
		//ch[count++]=ch[ch.length-1];
			
			ch=Arrays.copyOf(ch, count);
			
			System.out.println(Arrays.toString(ch));
		
		
/*		Map<String,Integer> map = new HashMap<String,Integer>();
		String[] st =str.split("");
		for(String c : st)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
				map.put(c,1);
				
		}
		System.out.println("The duplicate characters are : ");
		for(Entry<String, Integer> m:map.entrySet()) 
		 {
			if(m.getValue() > 1)
			{
			 System.out.println(m.getKey()); 
			}
		}*/
		/*System.out.println("The duplicate elements are :");		
		HashSet <Character> set1 = new HashSet<Character>();
		for(char c :ch)
		{
			if(set1.add(c)== false)  //set allows unique values when we try to add dup it will set false
			{
				System.out.println(c);
				//break;
			}
		}
*/
	}

}
