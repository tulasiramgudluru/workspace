import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Printingnos {
	/*public static void main( String[] args ) throws FileNotFoundException {
		for( int i=1; i<=5; i++ ){
		for( int j=1; j<=i; j++ ){
		System.out.print ( j );
		}
		System.out.println (); //to print new line for each iteration of outer loop
		}
		}*/
	/*public static void main( String[] args ){
		int p = 0;
		for( int i=1; i<=5; i++ ){
		for( int k=1; k<=5-i; k++ ){
		System.out.print (" ");
		}
		for( int j=1; j<=i+p; j++ ){
		System.out.print ("*");
		}
		System.out.println ();
		p=p+1;
		}
		}*/
	/*public static void readFile() throws FileNotFoundException {
		FileReader fr = new FileReader("D:cte.txt");
		BufferedReader br = new BufferedReader(fr);
		StringBuffer str = new StringBuffer();
		try {
		while (br.readLine()!= null){
		str.append(br.readLine());
		}
		} catch (IOException e) {
		e.printStackTrace();
		}
		System.out.println(str);
		}
	public static void main(String[]args) throws FileNotFoundException{
	readFile();
	System.out.println();
	}*/
	
	/*public static void reverse() {
		String str = "I use selenium webdriver. selenium is a tool for web applications.";
		int i = str.length();
		StringBuffer strb = new StringBuffer();
		for( int j=i-1; j>=0; j--){
		strb = strb.append(str.charAt(j));
		}
		System.out.println(strb);
		}
	public static void main(String[]args){
		reverse();
	}*/
	public static void replace() {
		String str = "I use selenium webdriver. selenium is a tool for web applications automation.";
		String toBeReplaced = "selenium";
		String toReplacedWith = "Firefox";
		String[] astr = str.split(toBeReplaced);
		StringBuffer strb = new StringBuffer();
		for ( int i = 0; i <= astr.length - 1; i++ ) {
		strb = strb.append( astr[i] );
		System.out.println(strb);
		if (i != astr.length - 1) {
		strb = strb.append(toReplacedWith);
		}
		}
		System.out.println(strb);}
		public static void main(String[]args){
			replace();
		}
}

