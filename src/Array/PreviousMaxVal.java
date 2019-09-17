package Array;

import java.util.Arrays;

public class PreviousMaxVal {

	public static void main(String[] args) {
		int a[] = {14,47,47,98,57,52,74,64,98};
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
    for(int i=a.length-1;i>=0;i--)
    {
    	 	if(a[i]>a[i-1])
    	{
    		int n=a[i-1];
    		
    		System.out.println(n);
    		break;
    	}
    }

	}

}
