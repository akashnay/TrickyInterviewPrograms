package Special;

public class UnreachableCode 
{

	public static void main(String[] args) 
	{
		final int a=10;
		final int b=20;
		
		do
		{
			System.out.println("Hiii");
			break;
		}
		while(a<b);
		
	   System.out.println("bye");

	}

}
