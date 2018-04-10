
public class MyBaseClass1{
	   public void disp()
	   {
	       System.out.println("Parent class method");
	   }
	}
	class Myparentclass extends MyBaseClass1{
	   public void disp(){
	      System.out.println("Child class method");
	   }
	   public static void main( String args[]) {
		   Myparentclass obj = new Myparentclass();
	      obj.disp();
	   }
	}