	package No.OfOcc;

import java.util.*;
import java.util.Map.*;

public class NoOfOccOfEachDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,1,2,2,3,4,5,6,4,6};
		 Arrays.sort(a);
		int n= a.length;
	noOfOccurenceDigit(a,n);
	//	noOfOccurenceDigit2(a,n);
	}

	private static void noOfOccurenceDigit2(int[] a, int n) {
		int count =1;
		for(int i=0;i<n-1;i++)
		{
			if((a[i]==a[i+1]))
			{
				++count;
				
			}
			else {
				System.out.println(a[i]+" "+ count++);
				count=1;
			}
			
		}
		System.out.println(a[n-1]+" "+count++);
		
	}

	public static void noOfOccurenceDigit(int[] a, int n) {
		
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		for (int i:a)
		{
			if(!hm.containsKey(i))
			{
				hm.put(i,1);
			}
			else {
				hm.put(i, hm.get(i)+1); //if the value is already exist then the value will be placed in incremented index
			}
		}
		System.out.println(hm);
		
		for(Entry<Integer, Integer> en : hm.entrySet())
		{
			if(en.getValue()>=1)
			{
				System.out.println(en.getKey()+" "+en.getValue());
			}
		}
			
	} 

}
