package Special;

public class HCF {

	public static void main(String[] args) {
		/* Find HCF of 18 & 27==>So, 
		 * Factors of 18 ==>1,2,3,6,9,18
		 * Factors of 27 ==>1,3,9,27
		 * So in both  Highest factor value is ===>9  
		 * i.e. Highest Common Factor in both is  9.
		 * So, 9 is HCF of 18 & 27...
		 */
		int n1=18; int n2=27;
		int hcf=0;
		for(int i=1;i<=n1;i++)
		{
			for(int j=1;j<=n2;j++)
			{
				if(n1%i==0 && n2%i==0)
				{
					hcf=i;
				}
			}
		}
		System.out.println(hcf);
	}

}
