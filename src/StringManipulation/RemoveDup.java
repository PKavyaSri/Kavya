package StringManipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDup {

	public static void main (String[] args )
	{
		int a[] = {10,20,30,10,30};
	List<Integer> list =new ArrayList(Arrays.asList(a));
	Set<Integer> rd =new HashSet<Integer>(list);
	System.out.println(rd.size());
	}
}