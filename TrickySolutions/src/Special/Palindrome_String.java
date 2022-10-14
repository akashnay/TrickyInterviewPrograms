package Special;

public class Palindrome_String {

	public static void main(String[] args) {
		//MADAM  //mom
		
		String str="mom";
		String reverse="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		if(reverse.equals(str))
		{
			System.out.println("Palindrom");
		}
		else
			System.out.println("Not Palindrom");

	}

}
