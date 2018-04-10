public class finalizeExample extends Exception
{
    public finalizeExample(String mymsg)
    {System.out.println(mymsg);
        //super(mymsg);
    }
    public static void main(String[] args)
    {
    	finalizeExample x=new finalizeExample("hi");
       //MyException1 es = x.new MyException1();
       MyException1 es = new MyException1();   //this is wrong we should declare as x. because we are accessing another class as subclass method 
        es.displayMymsg();
    }


public static class MyException1
{
	/*public static void main(String[] args){   // psvm should be declared in main class only
		 MyException1 es = new MyException1();
		 finalizeExample x=new finalizeExample("hi");
		
	}*/
   
    public void displayMymsg() 
    { 
        for(int j=8;j>0;j--)
        {
          System.out.println("j= "+j);
          if(j==7)
          {
              
          }
        }
    }
}
}



