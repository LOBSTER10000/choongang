package jdbc03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdtcEx {
	static Connection conn = null;
	static Statement stmt = null;
	static ResultSet rs = null;
	
	public static void update() throws SQLException {
		stmt = conn.createStatement();
		int res = stmt.executeUpdate("update student set id = 1110 where name = '홍'");
		System.out.println(res + "건 변경 성공했습니다");
	}
	
//	public static void insert(int id, String name, String hakbun, String address) throws SQLException {
//		int result = stmt.executeUpdate("insert into student values("+id+",'"+name+"','"+hakbun+"','"+address+"')");
//		System.out.println(result +"건 입력성공했습니다");
//	}
	public static void connect( ) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("드라이버 완료");
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/thisisjava", "java", "mysql");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("접속이 되었습니다");
	}
	public static void selectAll() throws SQLException {
		stmt = conn.createStatement();
		rs = stmt.executeQuery("select * from student");
		while(rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String hakbun = rs.getString("hakbun");
			String address = rs.getString("address");
			System.out.println(id + "," + name+"," + hakbun +","+ address);
		}
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		connect();
		selectAll();
//		insert(1109, "황상", "202209", "광주시 서구");
		update();
	}
}
