
public class Static {
	int x;
	int y;
	public static void main(String[]args){
		Static p=new Static();
		p.x=50;
		p.y=60;
		System.out.println(p.x+" "+p.y);
		//swap1(p.x,p.y);
		System.out.println(p.x+" "+p.y);
		//swap(p);
		System.out.println(p.x+" "+p.y);

	}
public static void swap(Static p){    //pass by reference
	int temp=p.x;
	p.x=p.y;
	p.y=temp;
}
	public static void swap1(int a,int b){   //pass by value
	int temp=a;
	a=b;
	b=temp;
}
}


	
	
	

