public class Exc1 {


public static void main(String[] args) {
	//Exc1 x=new Exc1();
	//A a=x.new A();
A a = new A();
B b = new B();
System.out.println(a.x);
//System.out.println(a.y);     //we can extend a class in main class itself
System.out.println(b.x);
System.out.println(b.y);
}
}

class A{
String x="Parent";
}
class B extends A{
String y="Child";
}