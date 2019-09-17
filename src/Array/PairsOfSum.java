package Array;

import java.util.*;

public class PairsOfSum {

	public static void main(String[] args) {
		
		int A[] = {1,4,5,8,6,7,9,3,2,0}; 
		int sum = 8;
		int temp;
		HashSet<Integer> hs =new HashSet<Integer>();
		for(int i=0;i<A.length;i++)
		{
			temp= sum-A[i];
			
			if(hs.contains(temp))
			{
				System.out.println(A[i]+ " " +temp);
			}
			else
			{
				hs.add(A[i]);
			}
		}
	}
}
