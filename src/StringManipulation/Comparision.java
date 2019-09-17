package StringManipulation;

import java.util.Arrays;

public class Comparision {

	public static void main(String[] args) {
		int a[] = {1,2,3,8,5,4,2,5,9,7};
		
		double n=2.5;
		int j=0;
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>n)
			{
			System.out.println(	a[i]);
			}
		}

	}

}
