package StringManipulation;

import java.util.*;

public class MissingNoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer a[] = {1,3,5,6,7};
		List<Integer> l = new ArrayList(Arrays.asList(a));
		System.out.println(Collections.max(l));
		for(int i=0;i<Collections.max(l);i++)
		{
			if(!l.contains(i))
			{
				System.out.println(i);
			
			}
		}

	}

}
