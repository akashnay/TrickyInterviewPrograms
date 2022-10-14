package PracticeQuetions;



public class AllStarPatterns 
{
	public static void main(String[] args) 
	{
System.out.println("1.");
		for (int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
System.out.println("-------------------------------------------");
System.out.println("2.");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
System.out.println("-------------------------------------------");
System.out.println("3.");
				for(int i=1;i<=5;i++)
				{
					for(int j=5;j>=i;j--)
					{
						System.out.print("*");
					}
					System.out.println();
				}	
System.out.println("-------------------------------------------");
System.out.println("4.");

				for(int i=1;i<=5;i++)
				{
					for(int j=4;j>=i;j--)
					{
						System.out.print(" ");
					}
					for(int k=1;k<=i;k++)
					{
						System.out.print("*");
					}
					System.out.println();
				}			
System.out.println("-------------------------------------------");
System.out.println("5.");

				for(int i=1;i<=5;i++)
				{
					for(int j=2;j<=i;j++)
					{
						System.out.print(" ");
					}
					for(int k=5;k>=i;k--)
					{
						System.out.print("*");
					}
					System.out.println();
				}	
System.out.println("-------------------------------------------");
System.out.println("6.");
				for(int i=1;i<=5;i++)
				{
					for(int j=4;j>=i;j--)
					{
						System.out.print(" ");
					}
					for(int k=1;k<=i;k++)
					{
						System.out.print("* ");
					}
					System.out.println();
				}	
System.out.println("-------------------------------------------");
System.out.println("7.");
				for(int i=1;i<=5;i++)
				{
					for(int j=2;j<=i;j++)
					{
						System.out.print(" ");
					}
					for(int k=5;k>=i;k--)
					{
						System.out.print("* ");
					}
					System.out.println();
				}	
System.out.println("-------------------------------------------");
System.out.println("8.");
				for(int i=1;i<=5;i++)
				{
					for(int j=1;j<=i;j++)
					{
						System.out.print("*");
					}
					for(int k=1;k<=2*(5-i);k++)
					{
						System.out.print(" ");
					}
					for(int l=1;l<=i;l++)
					{
						System.out.print("*");
					}
					System.out.println();
				}	
System.out.println("-------------------------------------------");
System.out.println("9.");
				for(int i=5;i>=1;i--)
				{
					for(int j=1;j<=i;j++)
					{
						System.out.print("*");
					}
					for(int k=1;k<=2*(5-i);k++)
					{
						System.out.print(" ");
					}
					for(int l=1;l<=i;l++)
					{
						System.out.print("*");
					}
					System.out.println();
				}				
System.out.println("-------------------------------------------");
System.out.println("10.");
				for(int i=1;i<=5;i++)
				{
					for(int j=2;j<=i;j++)
					{
						System.out.print(" ");
					}
					for(int k=5;k>=i;k--)
					{
						System.out.print("*");
					}
					System.out.println();
				}	
				for(int i=1;i<=5;i++)
				{
					for(int j=4;j>=i;j--)
					{
						System.out.print(" ");
					}
					for(int k=1;k<=i;k++)
					{
						System.out.print("*");
					}
					System.out.println();
				}				
System.out.println("-------------------------------------------");
System.out.println("11.");	
			for(int i=1;i<=4;i++)
			{
				for(int j=1;j<=5;j++)
				{
					if(i==1 || j==1 || i==4 || j==5)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
				System.out.println();
			}
System.out.println("-------------------------------------------");
System.out.println("12.");	System.out.println();
				int count=1;
				for(int i=1;i<=4;i++)
				{
					for(int k=1;k<=i;k++)
					{
						System.out.print(count+" ");
						count++;
					}
					System.out.println();
				}	
			
			
			
			
	}
}
