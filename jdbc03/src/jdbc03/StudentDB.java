package jdbc03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDB {
	Connection conn;
	Statement stmt;
	ResultSet rs;
	
	StudentDB() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("드라이버 완료");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/thisisjava", "java", "mysql");
		System.out.println("접속 완료");
	}
		
	public void selectAll() throws SQLException{
		stmt = conn.createStatement();
		rs = stmt.executeQuery("select * from student");
		while(rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String hakbun = rs.getString("hakbun");
			String address = rs.getString("address");
			System.out.printf("[%d] %s %s %s\n", id, name, hakbun, address);
		}
	}
	
	public void insertAll() throws SQLException{
		stmt = conn.createStatement();
		rs = stmt.executeQuery("select * from student");
		int res = stmt.executeUpdate("insert into student values(1111, '김창석', '202211', '서울 중구')"); 
		System.out.println(res +"건 입력 성공");
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new StudentDB();
		StudentDB studentDB2 = new StudentDB();
		studentDB2.selectAll();
		StudentDB studentDB = new StudentDB();
		studentDB.insertAll();
	}
}
