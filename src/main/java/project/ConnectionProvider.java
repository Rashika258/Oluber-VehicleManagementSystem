package project;
import java.sql.*;
public class ConnectionProvider {
	public static Connection getCon() throws ClassNotFoundException, SQLException {

			String url = "jdbc:mysql://localhost:3306/online";
		    String uname = "root";
		    String pass = "password";
			Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection con = DriverManager.getConnection(url, uname, pass);
			 return con;

	}
}
