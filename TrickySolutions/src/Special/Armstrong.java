package Special;

public class Armstrong {

	public static void main(String[] args) {
	// Armstrong Numbers==> 0 , 1 , 153 ,370, 371, 407, 1634, 54748
	// For Example,
	// 153 1*1*1=1 ,5*5*5=125 ,3*3*3=27 so,Sum= 1+125+27=153

		int num = 153;
		int originalNumber = num;
		int n = num;
		int count = 0;
		int sum = 0;
		int temp=0;
		while (n > 0) 
		{
			n = n / 10;
			count++;
		}
		
		for (int i = 1; i <= count; i++) 
		{
			 temp = num % 10;// 3

			if (count == 1)
				sum = sum + (temp);
			else if (count == 2)
				sum = sum + (temp * temp);
			else if (count == 3)
				sum = sum + (temp * temp * temp);
			else if (count == 4)
				sum = sum + (temp * temp * temp * temp);
			else if (count == 5)
				sum = sum + (temp * temp * temp * temp * temp);

			num = num / 10;
		}
		if (sum == originalNumber)
			System.out.println("Armstrong");
		else
			System.out.println("Not Armstrong");

	}

}
