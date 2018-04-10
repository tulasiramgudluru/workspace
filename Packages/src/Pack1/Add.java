package Pack1;

public class Add {
	
	public static void display(){
		
		System.out.println("Display test1 class method in pack1");
	}
	
	public Add(){
		
		System.out.println("default constructor");
		
	}
public Add(int i){
		
	System.out.println("single argument constructor");
	}
public Add(int j,int k){
	
  System.out.println(j+k);
}

public static void main(String[] args){
	
	Add t=new Add(10,20);
	
}


}
