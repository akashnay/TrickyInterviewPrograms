package Special;

public class Demo {

	public static void main(String[] args) 
	{
		int a[]= {11,66,44,88,55,22,77};
		int element=44;
		boolean flag=false;
		int i=0;
		
		for( i=0;i<a.length;i++)
		{
			if(element==a[i])//0
			{
				flag=true;
				break;
			}
		}
		
		if(flag==true)
		{
			System.out.println(element+" Element is present at "+i+" Index");
		}
		else
			System.out.println("Element not present");
	}

}
