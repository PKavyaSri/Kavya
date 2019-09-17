package StringManipulation;

import java.util.Arrays;

public class insertTheValueInCorrectIndex {
	
	public static void main (String [] args)
	{
	int a[]= {1,3,4,6};
	Arrays.sort(a);
	int tar=5;
	indexReturn(a,tar);
}
public static void indexReturn(int a[],int tar) 
{
	if(tar<a[0])
	{
		System.out.println(0);
		return;
	}
	 if(tar>=a[a.length-1])
	{
		System.out.println(a.length);
	}
	for(int i=0;i<a.length;i++)
	{
		if(tar<=a[i])
		{
			System.out.println(i);
		break;
		}
     }
 }
}
