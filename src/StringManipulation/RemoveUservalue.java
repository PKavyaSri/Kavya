package StringManipulation;
import java.util.*;

public class RemoveUservalue {
	public static int[] removeUserChoice(int a[],int target)
	{
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=target)
			{
				a[j++]=a[i];
			}
		}
		return Arrays.copyOf(a, j);
	}
	public static void main(String[] args) {
		int a[] = {3, 1, 2, 3, 4, 5};
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the element which you want to remove :");
		int target=sc.nextInt();
		System.out.println(Arrays.toString(removeUserChoice(a,target)));
	}
}
