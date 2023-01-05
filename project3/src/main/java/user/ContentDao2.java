package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.TreeSet;
public class ContentDao2 {
	 Connection conn;
	 PreparedStatement pstm;
	 ResultSet rs;
	
	public ContentDao2() {
		try {
		String dbURL = "jdbc:mysql://localhost:3306/thisisjava";
		String dbID = "root";
		String dbPassword = "mysql";
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	 public TreeSet<Content2> selectContent() {
	 TreeSet<Content2> contentList = new TreeSet<Content2>();
	 String sql = "select * from text2";
	 try {
	 pstm = conn.prepareStatement(sql);
	 rs = pstm.executeQuery();
	 while (rs.next()) {
	 	 Content2 content2 = new Content2(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4));
	 	 contentList.add(content2);
	 }
	 return contentList;
	 } catch (SQLException e) {
	 // TODO Auto-generated catch block
	 e.printStackTrace();
	 }
	 return null;
	 }
	 
	public static void main(String[] arg) {
		ContentDao2 cd = new ContentDao2();
	}
}
