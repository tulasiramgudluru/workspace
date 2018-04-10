
public class Static {

}
//Program of static variable  

/*class Student8{  
   int rollno;  
   String name;  
   static String college ="ITS";  
     
   Student8(int r,String n){  
   rollno = r;  
   name = n;  
   }  
 void display (){System.out.println(rollno+" "+name+" "+college);}  
  
 public static void main(String args[]){  
 Student8 s1 = new Student8(111,"Karan");  
 Student8 s2 = new Student8(222,"Aryan");  
   
 s1.display();  
 s2.display();  
 }  
}  */

// program of counter without static

/*class Counter{  
int count=0;//will get memory when instance is created  
  
Counter(){  
count++;  
System.out.println(count);  
}  
  
public static void main(String args[]){  
  
Counter c1=new Counter();  
Counter c2=new Counter();  
Counter c3=new Counter();  
  
 }  
} */ 

//Program of counter by static variable

/*class Counter2{  
static int count=0;//will get memory only once and retain its value  
  
Counter2(){  
count++;  
System.out.println(count);  
}  
  
public static void main(String args[]){  
  
Counter2 c1=new Counter2();  
Counter2 c2=new Counter2();  
Counter2 c3=new Counter2();  
  
 }  
}  */


//Program of changing the common property of all objects(static field).  

/*class Student9{  
     int rollno;  
     String name;  
     static String college = "ITS";  
       
     static void change(){  
     college = "BBDIT";  
     }  
  
     Student9(int r, String n){  
     rollno = r;  
     name = n;  
     }  
  
     void display (){System.out.println(rollno+" "+name+" "+college);}  
  
    public static void main(String args[]){  
    Student9.change();  
  
    Student9 s1 = new Student9 (111,"Karan");  
    Student9 s2 = new Student9 (222,"Aryan");  
    Student9 s3 = new Student9 (333,"Sonoo");  
  
    s1.display();  
    s2.display();  
    s3.display();  
    }  
}  

Test it Now

Output:111 Karan BBDIT
   222 Aryan BBDIT
   333 Sonoo BBDIT

Another example of static method that performs normal calculation

//Program to get cube of a given number by static method  
  
class Calculate{  
  static int cube(int x){  
  return x*x*x;  
  }  
  
  public static void main(String args[]){  
  int result=Calculate.cube(5);  
  System.out.println(result);  
  }  
}  */


/*class A{  
    int a=40;//non static  
      
    public static void main(String args[]){  
     System.out.println(a);  
    }  
   }        

Output:Compile Time Error*/

//example of static block

/*class A2{  
    static{System.out.println("static block is invoked");}  
    public static void main(String args[]){  
     System.out.println("Hello main");  
    }  
  }  

Output:static block is invoked
     Hello main*/

//static block without main

/*class A3{  
    static{  
    System.out.println("static block is invoked");  
    System.exit(0);  
    }  
  }  
Output:static block is invoked (if not JDK7)*/


