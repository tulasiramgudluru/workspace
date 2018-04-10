public class Exc2 {


public static void main(String[] args){
	
	
Exc2 x=new Exc2();
//B b=new B();
B b=x.new B();
Exc2 y=new Exc2();
A a=y.new A();

a.parentMeth();
b.childMeth();

b.childMeth();
b.parentMeth();
}
class A
{
public void parentMeth(){
	System.out.println("i");
	System.out.println("j");
	System.out.println("k");
	}
}
class B extends A
{
public void childMeth(){
	System.out.println("l");
	}
}

}




