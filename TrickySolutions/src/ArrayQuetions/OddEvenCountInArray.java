package ArrayQuetions;

public class OddEvenCountInArray {

	public static void main(String[] args) {
		int a[]= {11,211,32,44,51,63,78,88,19,10};
		int even=0;
		int odd=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		System.out.println("Even Count= "+even);
		System.out.println("odd Count= "+odd);

	}

}
