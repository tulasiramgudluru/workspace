
public class Result {
	
	public static void main(String[]args){
		Imax I=new Imax();
		I.online();
		I.eticket();
		I.counter();
		//I.Phonebooking();
		System.out.println("------");
		
		Multiplex M=new Multiplex();
		M.online();
		M.eticket();
		M.counter();
		System.out.println("------");
		
		Theater T=new Imax();
		T.online();
		T.eticket();
		T.counter();
		System.out.println("------");
		
		Theater T1=new Multiplex();
		T1.online();
		T1.eticket();
		T1.counter();
		System.out.println("------");
		
		T1=new Imax();
		T1.online();
		T1.eticket();
		T1.counter();
		System.out.println("------");
		
		Theater x=null;
		x=new Imax();
		x.online();
		x.eticket();
		x.counter();System.out.println("---*---");
		
		
		
		
		
	}

}
