package Special;

public class LCM {

	public static void main(String[] args) {
		/*
		 * LCM-(Least common multiple) find LCM of 5 and 9. 
		 * Multiples of number 5 = 5,10,15, 20, 25, 30, 35, 40, 45 and so on. 
		 * Multiples of number 9 = 9, 18, 27, 36, 45 and so on. 
		 * The first smallest common multiple is 45, of numbers 5 and 9. 
		 * Hence the LCM of the two numbers is 45.
		 */
		
		
		int n1=5; int n2=9; int lcm=0;
		int n1mul=0; int n2mul=0;
		for(int i=1;i<=10;i++)
		{
			 n1mul=n1*i;
			for(int j=1;j<=n2;j++)
			{
				n2mul=n2*j;
				if(n1mul==n2mul)
				{
					lcm=n2mul;
				}
			}
		}
System.out.println(lcm);
	}

}
