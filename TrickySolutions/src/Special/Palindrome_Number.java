package Special;

public class Palindrome_Number {

	public static void main(String[] args) {
		// 12321 //1234321

		int num=1234321;
		int originalNum=num;
		int temp=0;
		while(num>0)
		{
			
			temp=temp*10+num%10;
			num=num/10;
		}
		if(temp==originalNum)
		{
			System.out.println("Palindrom Number");
		}
		else
		{
			System.out.println("Not Palindrom Number");
		}
	}

}
