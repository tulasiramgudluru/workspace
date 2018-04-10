

public class StringFunctions {
	public static void main(String[ ]args){
		String str="the rains have started here";
		String str1="the rains have started here";
		System.out.println(str.length());
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf('t'));
		System.out.println(str.indexOf('h'));
		System.out.println(str.equals(str1));
		System.out.println(str.substring(1,6));
		String temp[]=str.split(" ");
		//String temp[]=str.split("have");
		
		
		//for(int i=0;i<str.length();i++)
		System.out.println(temp.length);
			for(int i=0;i<temp.length;i++)
			System.out.println(temp[i]);
		String x="100";
		int i=Integer.parseInt(x);
		System.out.println(i);
		String z=String.valueOf(i);
		System.out.println("String"+ z);
	}

}
