
public class Return {
	
	//Methods
	
	String returnString(String s){
		
		return s+" Krishna";
	}
	
	int returnInt(int a){
		
		return a+10;
	}
	
	boolean returnBoolean(boolean b){
		
		return b;
	}
	
	double returnDouble(double d){
		
		return d+1.0;
	}
	
	char returnChar(char c){
		
		return c;
	}

	public static void main(String[] args) {
		//data variables
		/*int a;
		boolean b;
		char c;
		double d;*/
		Return r=new Return();
		
		System.out.println(r.returnBoolean(false)+" "+r.returnChar('v')+" "+r.returnString("return")+" "+r.returnInt(100));
		System.out.println(r.returnBoolean(true)+" "+r.returnChar('x')+" "+r.returnString("return1")+" "+r.returnInt(1000));
		System.out.println(r.returnBoolean(false)+" "+r.returnChar('y')+" "+r.returnString("return2")+" "+r.returnInt(10000));
		System.out.println(r.returnBoolean(true)+" "+r.returnChar('z')+" "+r.returnString("return3")+" "+r.returnInt(10));
     
		/*d=r.returnDouble(20.45);
		b=r.returnBoolean(true);
		a=r.returnInt(3000);
		
		System.out.println(d+" "+b+" "+a);*/
	}

}
 