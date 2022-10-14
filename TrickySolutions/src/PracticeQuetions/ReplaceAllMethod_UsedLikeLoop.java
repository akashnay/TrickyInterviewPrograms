package PracticeQuetions;

public class ReplaceAllMethod_UsedLikeLoop {

	public static void main(String[] args) {
		String name="Akash";
		String s="i";
		
		s=s.replaceAll("i", "iiiiiiiiii"); //1*10=10
		//s=s.replaceAll("i", "iiiiiiiiii"); //10*10=100
		//s=s.replaceAll("i", "iiiiiiiiii"); //100*10=1000
		s=s.replaceAll("i", name+"\n");
		System.out.println(s);

	}

}
