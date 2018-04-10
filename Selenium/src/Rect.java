
public class Rect {
	int length;
	int width;
	void getdata(int x,int y){
		length=x;
		width=y;
		
	}
	int rectarea(){
		int area=length*width;
			return (area);
	}
		public static void main(String[] args){
	
			int c;
			int d;
		
			 Rect rect1=new Rect();
			 rect1.length=50;
			 rect1.width=50;
			 c =rect1.length*rect1.width;
			 rect1.getdata(60,60);
			 d=rect1.rectarea();
			 System.out.println("print area="+c);
			 System.out.println("print area="+d);
			 
			 
		}
	}


