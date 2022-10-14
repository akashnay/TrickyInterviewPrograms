package StringQuetions;

import java.util.LinkedHashSet;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {
		String str="Akash Naykude";
		LinkedHashSet<Character> set=new LinkedHashSet();
		
		for(int i=0;i<str.length();i++)
		{
			set.add(str.charAt(i));
		}
			
		for(char s:set)
		{
			System.out.print(s);
		}
			
	}

}
