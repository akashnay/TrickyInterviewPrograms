package Special;

public class GreaterNumber {

	public static void main(String[] args) {
		//Logic 1
		int a=1000; int b=2000; int c=3000; 
		if(a>b && a>c)
		{
			System.out.println("A is Greater");
		}
		else if(b>a && b>c)
		{
			System.out.println("B is Greater");
		}
		else if(c>a && c>b)
		{
			System.out.println("C is Greater");
		}
		
		//Logic 2
		if(a<b || a<c)
		{
			if(b<c)
			{
				System.out.println("C is Greater");
			}
			else
			{
				System.out.println("B is Greater");
			}
		}
		else
		{
			System.out.println("A is Greater");
		}
	}

}
