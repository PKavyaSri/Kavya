package Array;

import java.util.Arrays;

public class Median 
{

	public static double findMedian(int[] a, int n) 
	{
		Arrays.sort(a);
		if(n%2!=0)
		{
			return (double)a[n/2];
		}
		return (double) (a[(n-1)/2]+a[n/2])/2.0;
	}
			
	public static void main(String[] args) 
	{
	int a[] = {1,4,5,8,3,9};
	int n=a.length;
	System.out.println(findMedian(a,n));
	}
}
