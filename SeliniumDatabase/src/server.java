

import java.sql.*;
public class server {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
	          Connection con=null;
	          String url="jdbc:mysql://localhost:3306/";
	          String dbname="test";
	          String driver="com.mysql.jdbc.Driver";
	        String username="root";
	        String password="server";
try
{
	Class.forName(driver).newInstance();
	con=DriverManager.getConnection(url+dbname,username,password);
	Statement stmt=con.createStatement();
	ResultSet rs=stmt.executeQuery("Select * from emp");
	//rs.next();
	//System.out.println(rs.getString(2));
	//rs.next();
	//System.out.println(rs.getString(2));
	while(rs.next()){
		System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
	}
	PreparedStatement psmt=con.prepareStatement("Select * from emp where empjob=? and empname=?");
	psmt.setString(1, "it");
	psmt.setString(2, "ram");
	ResultSet rs1=psmt.executeQuery();
	while(rs1.next()){
		System.out.println(rs1.getString(1)+" "+rs1.getString(2)+" "+rs1.getString(3)+" "+rs1.getString(4));
	}
	psmt=con.prepareStatement("insert into emp values(?,?,?,?)");
	psmt.setString(1, "0");
	psmt.setString(2, "cam");
	psmt.setString(3, "it");
	psmt.setString(4, "c");
	psmt.executeUpdate();
	psmt=con.prepareStatement("delete  from emp where id=?");
	//psmt.setInt(1,8);
	psmt.setInt(1,9);
	//psmt.setInt(1,10);
	//psmt.setInt(1,7);
	int i=psmt.executeUpdate();
	if(i==1){
		System.out.println("inserted the the record");
	}
	
	}catch(Exception e){
	System.out.println("exception");
	e.printStackTrace();
                       }
	                     finally{
	                    con.close();
                       }
}
}
