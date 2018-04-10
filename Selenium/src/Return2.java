
public class Return2 extends Return1 {

	void show(){
		
		System.out.println("show return 2");
	}
	public static void main(String[] args) {
		
		Return2 r=new Return2();
		System.out.println(r.returnString("Murali"));
		r.display();
		r.show();
	}

}
