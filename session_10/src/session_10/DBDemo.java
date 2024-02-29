package session_10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class DBDemo {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Found");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jspm_02","root","Root123");
		System.out.println("Connection Established");
		PreparedStatement pstmt=con.prepareStatement("insert into employee(name,salary)"+"values(?,?)");
		
		Scanner s=new Scanner(System.in);
		String nm;
		double sal;
		System.out.println("enter employee name=");
		nm=s.next();
		System.out.println("enter employee salary=");
		sal=s.nextDouble();
		
		pstmt.setString(1,nm);
		pstmt.setDouble(2,sal);
		
		int i=pstmt.executeUpdate();
		System.out.println("i="+i);
		
		ResultSet rs=pstmt.executeQuery("Select * from employee");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
			
		}
		//PreparedStatement pstmt1=con.prepareStatement("");
		//ResultSet rs=pstmt1.executeQuery("delete from employee where id= 1");
		
		
		
	    	
		

	}

}
