package ArrayQuetions;

import java.util.LinkedHashSet;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 2, 1 };
		
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		System.out.println(set);
		
		for(int o:set)
		{
			System.out.print(o);
		}

	}

}
