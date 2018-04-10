
public class Switch {
public static void main(String[] args){
	char choice;
	System.out.println("select your choice");
	System.out.println("M-Madras");
	System.out.println("B-Bombay");
	System.out.println("C-Calcutta");
	System.out.println("Choice--");
	//System.out.flush();
	try
	{
		switch(choice=(char)System.in.read()){
		case 'M':
		case 'm':System.out.println("Madras :5");
		      break;
		case 'B':
		case 'b':System.out.println("Bombay :9");
		      break;
		case 'C':
		case 'c':System.out.println("Calcutta :15");
		      break;
		
		default:System.out.println("IC");
		      
		}
	}
	catch(Exception e){
		System.out.println("i/o error");
	}
}
}
