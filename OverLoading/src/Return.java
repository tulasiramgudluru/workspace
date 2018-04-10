
public class Return {
	
	public static int add(){
		int a =10;
		int b = 20;
		int c =a+b;
		return c;
		
	}
	
	public static int add(int i,int j){
		int a =10;
		int b = 20;
		int c =a+b;
		return c;
		
	}
	
	public static int add(int i,double j){
		int a =10;
		int b = 20;
		int c =a+b;
		return c;
		
	}
	
	public static int add(int i,boolean b,int j){
		int a =10;
		int b1 = 20;
		int c =a+b1;
		return c;
		
	}

	public static void main(String[] args) {
	int op;	
	op=Return.add();
	
	System.out.println(op+20);

	}

}
