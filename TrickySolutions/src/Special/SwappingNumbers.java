package Special;

public class SwappingNumbers {

	public static void main(String[] args) {
		//Logic 1
		int a=10;
		int b=20;
		int c=a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);
		
		//Logic 2  + -
		a=10;
		b=20;
		a=a+b; //30
		b=a-b; //10
		a=a-b; //20
		System.out.println(a);
		System.out.println(b);
		
		//Logic 3 * /
		a=10;
		b=20;
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println(a);
		System.out.println(b);
	}

}
