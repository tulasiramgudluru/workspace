
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1=0,i2=1,i3,count=20;
		System.out.println(i1+""+i2);
		if(count>0){
			for(int i4=2;i4<count;i4++){
			i3=i1+i2;
		System.out.println(i3);
		i1=i2;
		i2=i3;
			}
		}
	}
}
