class MyException extends Exception{
     String str1;
    MyException(String str2) {
       this.str1=str2;
       System.out.println(str1) ;
    
    }
    public String ToString(){ 
       return ("Output String = "+str1);
       
    }

    public static void main(String args[]){
    	MyException me=new MyException("hi");
    	
  //  ToString ts=me.new ToString();
    	//CustomException cs=ts.new CustomException();
       //try{
         // throw new MyException("Custom");
          // I'm throwing user defined custom exception above
      // }
      // catch(MyException exp){
          System.out.println("Hi this is my catch block") ;
          //ToString ts=me.new ToString();
          System.out.println(str1.MyException);  //str1 is non static so it canot be defined in static field
         
		//System.out.println(str1);
          //System.out.println(exp) ;
       }
    }

