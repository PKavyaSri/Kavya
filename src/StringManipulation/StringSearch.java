package StringManipulation;

public class StringSearch {

	public static void main(String[] args) {
		
		
		//String s="u";
		char ch1 = 'u';
		String st1= "Manjusha";
		char ch[] =st1.toCharArray();
		
		boolean a=(StringSearch(ch,ch1));
		if(a==true)
		{
			System.out.println("return test passed");
		}
		else
		{
			System.out.println("return test failed");
		}
		
	}

	private static boolean StringSearch(char[] ch,char ch1) {
		for(int i=0;i<ch.length;i++)
		{
				if(ch[i]== ch1)
				{
					return true;
				}
				
		}
		return false;
	}

}
