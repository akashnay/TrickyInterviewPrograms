package PracticeQuetions;

public class Test 
{
	
	public static void main(String[] args)
	{
		String s="Akash Naykude from Akluj";
		String str[]=s.split(" ");
		
		for(String w:str)
		{
			String rvsWord="";
			for(int i=w.length()-1;i>=0;i--)
			{
				rvsWord=rvsWord+w.charAt(i);
			}
			System.out.print(rvsWord+" ");
		}
	}
}

