package Abstraction;

public class LeftTrainglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=1; int n=4;
		for(int i=0;i<=n;i++)
		{
			
			for(int j=0;j<=i;j++)
			{
				System.out.print(a++ + " ");
				//a=a+1;
			}
			System.out.println();
		}

	}

}
