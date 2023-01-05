

package bbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BbsDao {

	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	
	public BbsDao() {
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
	
	public String getDate() {
		String sql = "select now()";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			if(rs.next()) {
			return rs.getString(1);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return ""; // 데이터 베이스 호출
	}
	
	public int getNext() {
		String sql = "select bbsID from bbs order by bbsID desc";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			if(rs.next()) {
			return rs.getInt(1) + 1;
			}
			return 1; // 첫번째 게시글인 경우
		} catch(Exception e) {
			e.printStackTrace();
		}
		return -1; // 데이터 베이스 호출
	}
	
	public int write(String bbsTitle, String userID, String bbsContent) {
		String sql = "insert into bbs values(?,?,?,?,?,?)";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setInt(1, getNext());
			psmt.setString(2, bbsTitle);
			psmt.setString(3, userID);
			psmt.setString(4, getDate());
			psmt.setString(5, bbsContent);
			psmt.setInt(6, 1);
			return psmt.executeUpdate(); // 첫번째 게시글인 경우
		} catch(Exception e) {
			e.printStackTrace();
		}
		return -1; // 데이터 베이스 호출
	}
	
	public ArrayList<Bbs> getList(int pageNumber){
		String sql = "select * from bbs where bbsID < ? and bbsAvailable = 1 order by bbsID desc LIMIT 100";
		ArrayList<Bbs> list = new ArrayList<Bbs>();
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setInt(1, getNext() - (pageNumber - 1) * 10);
			rs = psmt.executeQuery();
			while(rs.next()) {
				Bbs bbs = new Bbs();
				bbs.setBbsID(rs.getInt(1));
				bbs.setBbsTitle(rs.getString(2));
				bbs.setUserID(rs.getString(3));
				bbs.setBbsDate(rs.getString(4));
				bbs.setBbsContent(rs.getString(5));
				bbs.setBbsAvailable(rs.getInt(6));
				list.add(bbs);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return list; // 데이터 베이스 호출
	}
	
	public boolean nextPage(int pageNumber) {
		String sql = "select * from bbs where bbsID < ? and bbsAvailable = 1";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setInt(1, getNext() - (pageNumber - 1) * 10);
			rs = psmt.executeQuery();
			while(rs.next()) {
				return true;
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return false; // 데이터 베이스 호출
	}
	
	public Bbs getBbs(int bbsID) {
		String sql = "select * from bbs where bbsID = ?";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setInt(1, bbsID);
			rs = psmt.executeQuery();
			while(rs.next()) {
				Bbs bbs = new Bbs();
				bbs.setBbsID(rs.getInt(1));
				bbs.setBbsTitle(rs.getString(2));
				bbs.setUserID(rs.getString(3));
				bbs.setBbsDate(rs.getString(4));
				bbs.setBbsContent(rs.getString(5));
				bbs.setBbsAvailable(rs.getInt(6));
				return bbs;
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null; // 데이터 베이스 호출
	}
	
	public int update(int bbsID, String bbsTitle, String bbsContent) {
		String sql = "update bbs set bbsTitle = ?, bbsContent = ? where bbsID= ?";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, bbsTitle);
			psmt.setString(2, bbsContent);
			psmt.setInt(3, bbsID);
			return psmt.executeUpdate(); // 첫번째 게시글인 경우
		} catch(Exception e) {
			e.printStackTrace();
		}
		return -1; // 데이터 베이스 호출
	}
	
	
	public int delete(int bbsID) {
		String sql = "UPDATE BBS SET bbsAvailable = 0 WHERE bbsID = ?";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setInt(1, bbsID);
			return psmt.executeUpdate(); // 첫번째 게시글인 경우
		} catch(Exception e) {
			e.printStackTrace();
		}
		return -1; // 데이터 베이스 호출
	}
}
