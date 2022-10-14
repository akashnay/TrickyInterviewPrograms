package Special;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		//Logic 1
		int num=1011101010;
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println(count);
		
		
		//Logic 2
		num=1011101010;
		String str=String.valueOf(num);
		System.out.println(str.length());
	}

}
