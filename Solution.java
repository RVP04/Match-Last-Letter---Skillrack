import java.util.*;
public class Hello {

    public static void main(String[] args) {
	   
	   Scanner sc = new Scanner(System.in);
	   
	    //getting two string as input
	   String stringone = sc.next();
	   String stringtwo = sc.next();
	   
	    //findout the length of the two strings.
	   int stringOneLength = stringone.length();
	   int stringTwoLength = stringtwo.length();
	   
	    //create a flag to match the character first and last character only once
	    boolean flag = true;
	   
	   for(int i=0;i<stringOneLength;i++)
	   {
		//finding and matching the first and last character in two strings 
	       if(stringone.charAt(i)==stringtwo.charAt(stringTwoLength-1)&&flag)
	       {
	           System.out.println(new StringBuilder(stringtwo).reverse().toString()); //reverse the string two
	           flag = false; //once it is matched then this loop will not execute
	       }
	       //if not match or already matched this block will be executed
		else
	       {
	           System.out.println(stringone.charAt(i));
	       }
	   }
	}
}
