package ReverseString;

import java.util.Arrays;

public class ReverseArray {

	static void revArray(int a[])
	{
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		//return a;
			
	}
	public static void main(String[] args) {
				
		int a[] = {1,5,6,10,8};
		revArray(a);
		
	}

}
