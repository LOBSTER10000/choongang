package jdbc02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scan = new Scanner(System.in);
		Connection conn = null;
		Statement stmt = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("드라이버 완료");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/thisisjava", "java", "mysql");
		System.out.println("접속이 되었습니다");
		
		System.out.println("이름> ");
		String name = scan.next();
		System.out.println("학번> ");
		String hakbun = scan.next();
		System.out.println("주소> ");
		String address = scan.next();
		stmt = conn.createStatement(); // conn (db)값의 값을 불러오는 역할	
		int res = stmt.executeUpdate("insert into student "
				+ "values('1107', '" +name+"','" + hakbun +"','"+ address +"'"); 
		//mysql에 값을 추가하여 새로운 값들을 추가하는 기능
		System.out.println(res +"건 업데이트 성공"); // 추가된 값을 넣음
	}
}
