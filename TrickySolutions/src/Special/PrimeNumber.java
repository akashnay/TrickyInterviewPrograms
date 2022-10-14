package Special;

public class PrimeNumber {

	public static void main(String[] args) {
		//Number is only divisible by 1 and self only
		//2 3 5 7 11 13 17 19...

		int num=8;
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%1==0 && num%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(num+" is Prime Number");
		}
		else
			System.out.println(num+" is Not Prime Number");
	}

}
