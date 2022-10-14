package Special;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		Random rnum=new Random();
		int a=rnum.nextInt(1000);//(10)  or (100) or (1000)  ==> pass Range
		System.out.println(a);
	}

}
