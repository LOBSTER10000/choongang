package customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUpdate {
   Connection conn;
   Statement stmt;
   ResultSet rs;

   String number;
   int seatNum;
   int time;
   
   //전화번호 세팅 메소드
   void setNum(String number){
      this.number=number;
   }
   //좌석번호 세팅 메소드
   void setSeatNum(int seatNum) {
      this.seatNum = seatNum;
   }
   //시간 세팅 메소드
   void setTime(int time) {
           this.time = time;
   }
   
   //드라이버, DB연결 메소드
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
   
   
   //좌석번호 삽입 메소드
   void sUpdate() {
           DBConnect();
   
      try {
         stmt = conn.createStatement();
         int result = stmt.executeUpdate("update customer set seat ='"+seatNum+"'where number ='"+number+"'");
         System.out.println(result+"건 입력 성공");
      } catch (SQLException e) {
//         System.out.println("좌석정보 삽입 실패");
         e.printStackTrace();
      }
      return;
   }
   
   
   //좌석번호 제거 메소드
   void dUpdate() {
           DBConnect();
           
           try {
                stmt = conn.createStatement();
                int result = stmt.executeUpdate("update customer set seat =null where number ='"+number+"'");
       System.out.println(result+"건 입력 성공");
        } catch (SQLException e) {
                e.printStackTrace();
        }
   }
   
   
   //시작시간 삽입 메소드
   void stimeUpdate() {
           DBConnect();
           try {
                stmt = conn.createStatement();
                int result = stmt.executeUpdate("update customer set starttime ="+time+" where number ='"+number+"'");
             System.out.println(result+"건 입력 성공");
        } catch (SQLException e) {
                e.printStackTrace();
        }
   }
   
   
   
   //종료시간 삽입 메소드
   void etimeUpdate() {
           DBConnect();
   }

}