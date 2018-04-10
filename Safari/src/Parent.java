import java.io.*;  
class Parent{  
  void msg() throws IOException{System.out.println("parent");}  
}  
  
class TestExceptionChild extends Parent{  
  void msg()throws IOException{  
    System.out.println("TestExceptionChild");  
  }  
  public static void main(String args[]) throws IOException{  
   //Parent p=new TestExceptionChild(); 
   //Parent p=new Parent();
   TestExceptionChild p=new TestExceptionChild();
   p.msg();  
  }  
}  
