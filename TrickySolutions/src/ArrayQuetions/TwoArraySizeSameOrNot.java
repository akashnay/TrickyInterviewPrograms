package ArrayQuetions;

import java.util.Arrays;

public class TwoArraySizeSameOrNot {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {1,2,3,4,5};
		
		boolean result=Arrays.equals(a, b);
			if(result==true)
			{
				System.out.println("same");
			}
			else
				System.out.println("Not Same");
	}

	
	
}
