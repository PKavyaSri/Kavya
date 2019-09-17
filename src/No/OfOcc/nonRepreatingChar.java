package No.OfOcc;

public class nonRepreatingChar {

	public static void main(String[] args) {
	String s ="kavkya";
	int j=0;
	for(Character ch:s.toCharArray())
		{
		
		System.out.println(s.indexOf(ch));
		if(s.indexOf(ch)==s.lastIndexOf(ch))
		{
			System.out.println(ch);
			break;
		}
		
	}

	}

}
