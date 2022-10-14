package Special;

public class ReverseNumber {

	public static void main(String[] args) {
		// 12345==>54321
		
		int num=12345; //1
		int originalNum=num;
		int temp=0;
		while(num>0)
		{
			temp=temp*10+num%10; 
			//0*10=0+5=5 //5*10=50+4=54 //54*10=540+3=543 //543*10=5430+2=5432 //5432*10=54320+1=54321
			num=num/10;
		}
		System.out.println(temp);//54321
	}

}
