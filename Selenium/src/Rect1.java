
public class Rect1 {
	int length;
	int breadth;
	 void getdata(int x,int y){
		 length=x;
		 breadth=y;}
		  int area(){
			  int area1=length*breadth;
			  return(area1);
			  }
		  public static void main(String[] args){
			  int b;
			  Rect1 rrct=new Rect1();
			  rrct.getdata(80,80);
			  b=rrct.area();
			  System.out.println("print"+b);
		  }
	 }


