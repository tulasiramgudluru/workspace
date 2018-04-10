import java.util.Scanner;

public class Reverse_string {

		   public static void main(String[] args){
		      String string="tulasiram";
		      //Scanner string=new Scanner(System.in);
		     
		      String reverse = new StringBuffer(string).
		    		  //StringBuffer reverse = new StringBuffer.reverse().toString();
		    		  reverse().toString();
		      System.out.println("\nString before reverse:"+string);
		      System.out.println("String after reverse:"+reverse);
		   }
		}


