package StringQuetions;

public class PrintOnlyNumbersFromString {

	public static void main(String[] args) {
		String str="Akash105";
		
		//Print Only NumberFrom Strng
	//	String str2=str.replaceAll("[a-zA-z]", "");
		String str2=str.replaceAll("[^0-9]", "");
		System.out.println(str2);
		
		//Print only Alphabes From String
		String s="Akash105";
		String s1=s.replaceAll("[^a-zA-Z]", "");
		System.out.println(s1);

	}

}
