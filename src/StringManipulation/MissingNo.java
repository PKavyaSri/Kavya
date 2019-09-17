package StringManipulation;

public class MissingNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4,6,7,8};
		int miss = getMissinNo(a,7);
		
		System.out.println(miss);

	}

	private static int getMissinNo(int[] a, int n)
	{
	   int total;
	   total =(n+1)*(n+2)/2;
	   for(int i=0;i<n;i++)
	   {
		   total -= a[i];
		  
	   }
	return total;
		
	}

}
