package ArrayQuetions;

public class FindOrSearchElementInArray {

	public static void main(String[] args) {
		int a[]= {10,50,40,30,70,90,20};
		int element=50;
		boolean flag=false;
		int i;
		for( i=0;i<a.length;i++)
		{
			if(element==a[i])
			{
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("Element is at: "+i+" index");
			
		}
		else
		{
			System.out.println("Element not Found in array");
		}
	}

}
