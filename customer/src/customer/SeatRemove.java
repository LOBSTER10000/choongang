package customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SeatRemove {
	Connection conn;
	Statement stmt;
	ResultSet rs;

	String number;
	String seatNum;
	
	 //전화번호 세팅 메소드
	   void setNum(String number){
	      this.number=number;
	   }
	   //좌석번호 세팅 메소드
	   void setSeatNum(String seatNum) {
	      this.seatNum = seatNum;
	   }
	
	void DBConnect() {
		
        try {
         Class.forName("com.mysql.cj.jdbc.Driver");
      } catch (ClassNotFoundException e) {
         e.printStackTrace();
      }
      System.out.println("드라이버 완료");
      try {
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/thisisjava", "java", "mysql");
      } catch (SQLException e) {
         e.printStackTrace();
      }
      System.out.println("접속 완료");
   }
	
	void SelectSeat() {
		DBConnect();
		try {
			stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery("SELECT seat from customer where number='"+number+"'");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		SeatRemove remov = new SeatRemove();
		remov.SelectSeat();
		
	}
}
