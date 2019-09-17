package StringManipulation;

import java.util.Arrays;
import java.util.*;

public class TargetValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {0,1,2,3,5,6,7};
		Arrays.sort(a);
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the target value");
		int target = sc.nextInt(); 
		
		System.out.println(returnValue(a,target));
	}

	private static int returnValue(int[] a, int target) {
		
		int val=0;
		for(int x: a)
		{
			if(x < target)
			{
				val=x;
				//System.out.println(val);
				//break;
			}
			
		}
		return val;
		
	}

}
