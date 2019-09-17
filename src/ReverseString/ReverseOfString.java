package ReverseString;

public class ReverseOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= "aaabbcccc";
	/*	StringBuilder sb = new StringBuilder(s1);
		sb.reverse();
		System.out.println(sb.toString()); */
		
		char[] ch = s1.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.println(ch[i]);
		}
		

	}

}
