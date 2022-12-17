package jdbc02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteEx {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection conn = null;
		Statement stmt = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("드라이버 완료");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/thisisjava", "java", "mysql");
		System.out.println("접속이 되었습니다");
		stmt = conn.createStatement(); // conn (db)값의 값을 불러오는 역할	
		int res = stmt.executeUpdate("Delete from student where id = 1107"); 
		//mysql에 값을 추가하여 새로운 값들을 추가하는 기능
		System.out.println(res +"건 삭제 성공"); // 추가된 값을 넣음
	}
}