 package ReplaceInString;

import java.util.*;

public class replaceSpaceInChar {

	public static void main(String[] args) {
		String str="abc bca def";
		
		char ch[] = str.toCharArray();
		String text ="";
		replaceSpace(ch,text);

	}

	public static void replaceSpace(char[] ch,String text) {
		ArrayList <Character> al =new ArrayList<Character>();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
			{
				al.add('%');
				al.add('2');
				al.add('0');
			}
			else
			{
				al.add(ch[i]);
			}
		}
		char c[] = new char[al.size()];
		for(int j=0;j<c.length;j++)
		{
			c[j] =al.get(j);
		}
		System.out.println(Arrays.toString(c));
		text = new String(c);
		System.out.println(text);
		
		//return c;
	}

}
