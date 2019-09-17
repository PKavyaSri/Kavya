package No.OfOcc;

import java.util.Arrays;

public class NoOfOccEachChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "aabbaaccc";
		char ch[] = str.toCharArray();
		//Arrays.sort(ch);
		int count =1;
		for(int i=0;i<ch.length-1;i++)
		{
			if(ch[i]==ch[i+1])
			{
				count++;
				//System.out.println(ch[i]+" "+count);
			}
			else
			{
			 System.out.println(ch[i]+" "+count);
				count =1;
			}
		}
		
		System.out.println(ch[ch.length-1]+" "+count++);
	}

}
