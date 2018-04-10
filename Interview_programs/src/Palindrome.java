import java.util.Scanner;

//public class Palindrome {
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner str=new Scanner(System.in);
		String original=str.nextLine();
		int length=original.length();
		for(int i=length-1;i>=0;i--){
			String reverse="";
				reverse=reverse + original.charAt(i);
				//reverse=reverse.append(original.charAt(i));          //                doubt
				System.out.print(reverse);
				
				if(original.equals(reverse))
					System.out.println("given string is Palindrome");
				else
					System.out.println("given string is not Palindrome");
					}
}
}*/
import java.util.*;

class Palindrome{                     //ReverseString
 public static void main(String args[])
   {
      String original, reverse = "";
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a string to reverse");
      original = in.nextLine();
      int length = original.length();
      for ( int i = length - 1 ; i >= 0 ; i-- )
         reverse = reverse + original.charAt(i);
      System.out.println("Reverse of entered string is: "+reverse);
   }
}