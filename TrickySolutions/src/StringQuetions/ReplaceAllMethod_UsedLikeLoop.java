package StringQuetions;

public class ReplaceAllMethod_UsedLikeLoop {

	public static void main(String[] args) {
		String name="Akash";
		String s="i";
		
		s=s.replaceAll("i", "iiiiiiiiiii");
		s=s.replaceAll("i", name+" ");
		System.out.println(s);
	}

}
