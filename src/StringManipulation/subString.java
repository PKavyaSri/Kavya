package StringManipulation;

public class subString {
	public static void main(String[] args) {
		String s= "java is a programming language";
		String s1 = "programming language";
		boolean b=false;
		int j=0;
		for(int i=0;i<s.length();i++)
		{
			if(s1.charAt(j)==s.charAt(i))
			{
				j++;
			}
			else
			{
				j=0;
			}
			if(j==s1.length())
			{
				b=true;
				break;
			}
		}
		if(b==true)
		{
			System.out.println("S1 is a substring of S");
		}
		else
		{
			System.out.println("S1 is not substring of S");
		}
	}

}
