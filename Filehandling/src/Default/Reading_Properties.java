package Default;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Reading_Properties { 
	public static void main(String[]args)throws IOException{
		System.out.println(System.getProperty("user.dir"));
		Properties prop=new Properties();
		FileInputStream ip=new FileInputStream("C:\\Users\\GUDLURU\\workspace\\Filehandling\\src\\Config\\Employee.prpoerites");
		//FileInputStream ip=new FileInputStream(System.getproperty("user.dir")+"\\src\\Config\\Employee.prpoerites");
prop.load(ip);
System.out.println(prop.getProperty("name"));
System.out.println(prop.getProperty("city"));
System.out.println(prop.getProperty("DOB"));
System.out.println(prop.getProperty("Hobbies"));
System.out.println(prop.getProperty("age"));
	}}
	
