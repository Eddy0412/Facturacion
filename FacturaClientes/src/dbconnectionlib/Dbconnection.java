package dbconnectionlib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnection {
	
	
	// String url = "jdbc:mysql://10.1.104.32:3306/facturacion?useSSL=false";
	String url = "jdbc:mysql://10.1.104.32:3306/facturacion?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false";
	String user = "Guest";
	String password = "123456789";
	
	Connection con = null;
	
	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public Dbconnection(){

		try {
			
			/* Class.forName("com.mysql.jdbc.Driver"); */
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			System.out.println("MySQL Driver found!");
		} catch (ClassNotFoundException e1) {
			System.out.println("Driver not found"+e1);
		}

			
			try {
				
				con = DriverManager.getConnection(url, user, password);
				
				System.out.println("Login Successful!");
			} catch(SQLException e) {
				System.out.println(e);
				System.out.println("It didn't Connect.");
			}
}
	}
