
public class Return1 extends Return {
	
	//static void display(){

	void display(){
		
		System.out.println("return1 class");
	}
	
	public static void main(String[] args) {
	
		{
			Return1 r=new Return1();
		System.out.println(r.returnString("Murali"));
		System.out.println(r.returnChar('c'));
		r.display();
	//display();

	

}
}}