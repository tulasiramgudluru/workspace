
public class inher2 extends inher1 {
void display(){
	System.out.println("displaying");
}
public static void main(String[]args){
	inher2 i2=new inher2();
	i2.start();
	i2.stop();
	i2.read();
	i2.write();
	i2.display();
}
}
