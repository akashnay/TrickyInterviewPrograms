package StringQuetions;

public class FindDuplicatesFromSingleString {

	public static void main(String[] args) {
		String str = "Hello";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			for (int j = i + 1; j < str.length(); j++) {
				char ch1 = str.charAt(j);
				if (ch == ch1) {
					System.out.print(ch);
				}
			}

		}

	}

}
