
public class Test {
	static int a=20;
	//static int b;
	 static void display(){
		System.out.println("hi display");
	}
	 static void stop(){
		System.out.println("hi stop");
	}
	 //method
	  static int add(int a,int b){
		  int c=a*b;
		// c = a+b;
		 return c;
		
	 }
	public static void main(String[] args){
		//Test t=new Test();
	//System.out.println(t.a);
		System.out.println(a);
	//t.stop();
	// t.display();
		stop();
		display();
		//add(50,50);  //is wrong as we cant define withoutsyso
		System.out.println(add(50,50));
		System.out.println(add(10,20)+30);
		
		//int d=add(20,30);
		//System.out.println(d);
		//int f=add(30,40);
		//System.out.println(f);
		}
	}

