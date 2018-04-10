
public class Child extends Super {
	
	 int a=10;
	
	 void display(int a){		
		System.out.println(a);
		a=super.a;
		System.out.println(a);
		System.out.println(a);
	}
	
	
	public static void main(String[] args){
		
		Child t=new Child();
		t.display(20);
	}

}
