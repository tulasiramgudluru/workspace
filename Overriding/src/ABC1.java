
public class ABC1 {


	   public void mymethod()
	   {
	       System.out.println("Class ABC: mymethod()");
	   }	   
	}
	class vest extends ABC1{
	   public void mymethod(){
	      //This will call the mymethod() of parent class
	      super.mymethod();
	      System.out.println("Class Test: mymethod()");
	   }
	   public static void main( String args[]) {
	      vest obj = new vest();
	      obj.mymethod();
	   }
	}