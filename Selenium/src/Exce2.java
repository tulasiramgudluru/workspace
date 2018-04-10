public class Exce2 {
//int i1;
static int i=50;
static int  j=50;

public static void main(String[] args) {
Exce2 t = new Exce2();
t.non_static();
t.meth_static2();//shoudnt define as nonstatic because it is static
	meth_static2();
//t.i1=100;
i=100;
j=200;

t.j=400;
}


public void non_static(){
System.out.println("pass1");
System.out.println(i);
System.out.println(j);
//System.out.println(i1);
}

public static void meth_static2(){
System.out.println("pass2");
}

}