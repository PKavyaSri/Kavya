package Array;

public class Permutations {

	public static void main(String[] args) {
		
		
		String s= "ABCD";int count=0;
		
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
				System.out.println(s.substring(i, j));
				count++;
				
			}
			
			
		}
		
		}

	}


