package ReverseString;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Chennai is a green city";
		char[] ch = s.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.println(ch[i]);
		}

}
}
