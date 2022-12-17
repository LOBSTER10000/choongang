package jdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnEx {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("드라이버 성공");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/thisisjava", "java", "mysql");
		System.out.println("접속 성공");
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(
				"select * from student where id = 1105");
		if(rs.next()) {
			System.out.println(rs.getString("name"));
		}
	}
}
