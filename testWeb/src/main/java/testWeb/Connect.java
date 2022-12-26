package testWeb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
	public static Connection getConnect() {
		try {
			try {
				Class.forName("oracle.jdbc.OracleDriver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 	String url = "jdbc:oracle:thin:@localhost:1521:xe";
		 	String user = "SCOTT";
		 	String password = "tiger";
		 	Connection con = DriverManager.getConnection(url, user, password);
		 	return con;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 	
		return null;
	}
}
