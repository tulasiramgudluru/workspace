
public class inher1 extends inher {
	
	void read(){
		System.out.println("reading");
	}
void write(){
	System.out.println("writing");}
@Override
void start(){
	System.out.println(" reading starting");
}
	
	public static void main(String[]args){
		inher1 i1=new inher1();
	i1.start();
	i1.stop();
	i1.read();
	i1.write();
}
}
