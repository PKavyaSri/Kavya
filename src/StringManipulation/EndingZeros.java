package StringManipulation;

import java.util.Arrays;

public class EndingZeros {
	public static void main(String[] args) {
				
		int a[] = {0,1,2,0,3,0,0}; 
		int n=a.length;
		endingZeros(a,n);
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}

	private static void endingZeros(int[] a, int n) {
		int j=0;
		for(int i=0;i<n;i++)
		{
			if (a[i]!= 0)
			{
				a[j++]=a[i];
			}
		}
			while(j<n)
			{
				a[j++]=0;
			}
		System.out.println(Arrays.toString(a));	
		}
		
	}


