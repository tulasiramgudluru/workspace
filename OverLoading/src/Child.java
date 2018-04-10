import java.util.ArrayList;
import java.util.Hashtable;

public class Child extends Parent {

void start(){
		
		System.out.println("Child start");
	}

  public static void main(String[] args){
	  
	String[] str={"murali","tulasi","sagar"};
	 
	 System.out.println(str.length);
	 System.out.println(str[0]);
	 System.out.println(str[2]);
	 System.out.println(str[1]);
	 
	 String[] str1=new String[3];
	try{
		str1[0]="sagar";
		 str1[1]="tulasi";
		 str1[2]="Murali";
		 
		 str1[3]="dummy";
		 
	}catch(Exception X){
		
		System.out.println(X.toString());
		System.out.println(str1[0]);
		System.out.println(str1[1]);
		System.out.println(str1[2]);
	}
	
	ArrayList<String> list=new ArrayList<String>();
	
	list.add("1");
	list.add("2");
	list.add("3");
	list.add("4");
	list.add("5");
	list.add("5");
	
	for(int i=0;i<list.size();i++){
		
		System.out.println(list.get(i));
	}
	
	Hashtable<String,String> hash=new Hashtable<String,String>();
	  
    hash.put("name", "tulasi");
    hash.put("age", "28");
    hash.put("name1", "sagar");
    hash.put("age1", "33");
    
 System.out.println(hash.size());
 
   System.out.println(hash.get("name1"));
   System.out.println(hash.get("age1"));
	  
  }
  
  

}
