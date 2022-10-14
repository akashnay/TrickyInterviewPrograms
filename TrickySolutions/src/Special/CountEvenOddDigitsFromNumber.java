package Special;

public class CountEvenOddDigitsFromNumber {

	static
	{
		int num=1236544265;//even=6 //odd=4
		int even=0;
		int odd=0;
		
		
		while(num>0)
		{
			int temp=num%10;
			if(temp%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
			temp=0;
			num=num/10;
		}
		System.out.println("Even count is: "+even);
		System.out.println("Odd Count is: "+odd);
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println("This is main Method");
	}

}
