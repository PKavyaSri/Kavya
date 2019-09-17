package StringManipulation;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveEleInArr {

	public static void main(String[] args) {
		
		int a[] = {3, 1, 2, 3, 4, 5};
		//int val =4;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the value to remove from Array");
		int val =s.nextInt();
		System.out.println(Arrays.toString(removeEleInArray(a,val)));	
	}

	private static int[] removeEleInArray(int[] a, int val) {
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			if(!(a[i]==val))
			{
			     a[j++] =a[i];  
			}		
		}
		return Arrays.copyOf(a, j);	
	}
}
