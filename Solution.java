import java.util.*;
public class Hello {

    public static void main(String[] args) {
	   
	   Scanner sc = new Scanner(System.in);
	   String stringone = sc.next();
	   String stringtwo = sc.next();
	   
	   int stringOneLength = stringone.length();
	   int stringTwoLength = stringtwo.length();
	   boolean flag = true;
	   
	   for(int i=0;i<stringOneLength;i++)
	   {
	       if(stringone.charAt(i)==stringtwo.charAt(stringTwoLength-1)&&flag)
	       {
	           System.out.println(new StringBuilder(stringtwo).reverse().toString());
	           flag = false;
	       }
	       else
	       {
	           System.out.println(stringone.charAt(i));
	       }
	   }

	}
}
