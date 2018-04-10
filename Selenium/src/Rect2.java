public class Rect2 {
	int rectarea(int length,int width){
		int area=length*width;
			return (area);
	}
		public static void main(String[] args){
	         int c;
	         int d;
		     Rect rect2=new Rect();
			 rect2.length=50;
			 rect2.width=50;
			 c =rect2.length*rect2.width;
			 rect2.getdata(60,60);
			 d=rect2.rectarea();
			 System.out.println("print area="+c);
			 System.out.println("print area="+d);
			 
			 
		}
	}