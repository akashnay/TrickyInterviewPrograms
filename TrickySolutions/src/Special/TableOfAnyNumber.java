package Special;

import java.util.Scanner;

public class TableOfAnyNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num=sc.nextInt();
		
		
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(num*i);
		}

	}

}
