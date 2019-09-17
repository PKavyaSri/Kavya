package ReverseString;

public class reverseWordInString {

	public static void main(String[] args) {
	
		String st = "Chennai is a green city";
		String[] s=st.split(" ");
		String reverse="";
		for(int i=s.length-1;i>=0;i--)
		{
			reverse=reverse+s[i]+" ";
		}
			System.out.println(reverse);
	}

}
