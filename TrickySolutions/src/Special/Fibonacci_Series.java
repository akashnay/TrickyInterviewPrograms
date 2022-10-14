package Special;

public class Fibonacci_Series {

	public static void main(String[] args) {
		//0 1 1 2 3 5 8 13 21...
		int num=0;
		int n1=0;
		int n2=1;
		int sum=0;
		System.out.print(n1+" "+n2);
		while(num<8)
		{
			sum=n1+n2;
			System.out.print(" "+sum);
			n1=n2;
			n2=sum;
			num++;
		}
	}

}
