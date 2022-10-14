package StringQuetions;

public class MaximumOccuringCharacter {
//Not Understand yet
	 static final int n = 256;

	    public static void main(String[] args)
	    {
	        String str = "This is India";
	        int count[] = new int[n];
	        int len = str.length();//13
	        for (int i=0; i<len; i++) //0-12
	        {
	            count[str.charAt(i)]++; //
	        }
	        int max = -1;  
	        char result = ' ';   
	        for (int i = 0; i < len; i++) 
	        {
	            if (max < count[str.charAt(i)]) 
	            {
	                max = count[str.charAt(i)];
	                result = str.charAt(i);
	            }
	        }
	        System.out.println("Max occurring character is " +
                   result);
	    }

}
