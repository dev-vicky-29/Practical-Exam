package JDBC;

import java.sql.*;

public class StudentJDBC {

	public static void main(String[] args){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection Con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/studentdb","root","VICKY");
			Statement stmt = Con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM studentdb.student_info;");
			while(rs.next())
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" " +rs.getFloat(3));
			   Con.close();
			   rs.close();
			   stmt.close();	
			
		} catch (ClassNotFoundException|SQLException e ) {
				
				e.printStackTrace();
			}	
	}
}
