package ArrayQuetions;

public class MaximumValueOfArray {

	public static void main(String[] args) {
		int a[]= {10,400,30,700,200};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max+" is a Max Value");
	}

}
