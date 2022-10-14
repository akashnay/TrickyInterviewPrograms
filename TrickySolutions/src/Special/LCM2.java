package Special;

public class LCM2 {

	public static void main(String[] args) {
		/*
		 * LCM-(Least common multiple) find LCM of 5 and 9. 
		 * Multiples of number 5 = 5,10,15, 20, 25, 30, 35, 40, 45 and so on. 
		 * Multiples of number 9 = 9, 18, 27, 36, 45 and so on. 
		 * The first smallest common multiple is 45, of numbers 5 and 9. 
		 * Hence the LCM of the two numbers is 45.
		 */
		int n1 = 5;
		int n2 = 9;
		int temp1 = 0;
		int temp2 = 0;
		int count = 0;

		for (int i = 1; i <= 100; i++) 
		{
			temp1 = n1 * i;
			for (int j = 1; j <= 100; j++) 
			{
				temp2 = n2 * j;

				if (temp1 == temp2)
				{
					count++;
					if (count == 1) 
					{
						System.out.println("LCM is: " + temp1);
					}
					
				}
			}
		}

	}

}
