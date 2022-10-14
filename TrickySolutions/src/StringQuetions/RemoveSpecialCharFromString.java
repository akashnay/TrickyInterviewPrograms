package StringQuetions;

public class RemoveSpecialCharFromString {

	public static void main(String[] args) {
		String str="Akash&^$&^";
		String str2=str.replaceAll("[^0-9a-zA-Z]", "");
		System.out.println(str2);

	}

}
