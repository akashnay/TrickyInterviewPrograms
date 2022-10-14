package ArrayQuetions;

import java.util.LinkedHashSet;

public class RemoveDuplicatesFromStringArray {

	public static void main(String[] args) {
		String a[]= {"Akash","Mauli", "Sudam", "Akash","Mauli"};
		
		LinkedHashSet set=new LinkedHashSet();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		System.out.println(set);
	}

}
