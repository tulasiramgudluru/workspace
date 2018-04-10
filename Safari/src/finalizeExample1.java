public class finalizeExample1 extends Exception
{

    public finalizeExample1(String mymsg)
    {
    	System.out.println(mymsg);
        //super(mymsg);
    }
    
    public static void main(String[] args)
    {
	    
 	finalizeExample1 x1=new finalizeExample1("hi");
    MyException2 as = x1.new MyException2();
    //MyException2 es = new MyException2();   //this is wrong we should declare as x. because we are accessing another class as subclass method 
     as.displayMymsg();
     }

    public static class MyException2
{
	     public void displayMymsg()
	     {
     
        for(int j=8;j>0;j--)
        {
          System.out.println("j= "+j);
          if(j==7)
          {
              
          }
        }
	     }}}





    
	    /*public static void main(String[] args){   // psvm should be declared in main class only
			 //MyException1 es = x.new MyException1();
			 //finalizeExample x=new finalizeExample("hi");
			 /*es.*///displayMymsg();
				//}*/




