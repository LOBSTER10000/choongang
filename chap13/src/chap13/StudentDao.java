package chap13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
	Connection conn;
	PreparedStatement pstm;
	ResultSet rs;

	void connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 접속");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/thisisjava", "java", "mysql");
			System.out.println("접속 완료");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Student 데이터 형식을 가진 데이터를 매개변수로 가지고 int 데이터 형식의 데이터를 리턴한다.
	int insert(Student stu) {
		String sql = "insert into student(id, name, hakbun, address) values(?,?,?,?)";
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, stu.getId());
			pstm.setString(2, stu.getName());
			pstm.setString(3, stu.getHakbun());
			pstm.setString(4, stu.getAddr());
			return pstm.executeUpdate();
//			pstm.executeQuery() // select
//			pstm.executeUpdate() // insert, update, delete

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (pstm != null) {
				try {
					pstm.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return 0;
	}
  //List의 <Student>는 list = {1,2,3,4,5}에 Student라는 클래스만 담을 수 있다.
	List<Student> select() {
		List<Student> list = new ArrayList<Student>();
		String sql = "select id, name, hakbun, address from student";
		try {
			pstm = conn.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				Student stu1 = new Student();

				int id = rs.getInt(1);
				stu1.setId(id);

//				stu1.id = rs.getInt(1);

				Student stu = new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
				System.out.print(rs.getInt(1) + ", ");
				System.out.print(rs.getString(2) + ", ");
				System.out.print(rs.getString(3) + ", ");
				System.out.println(rs.getString(4));
				list.add(stu);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;

	}

	public static void main(String[] args) {
		StudentDao sd = new StudentDao();
		sd.connect();
//		int res = 
//		sd.insert(new Student(2, "최용수", "202201", "춘천시 중구"));
//		System.out.println(res + "건 입력!");
//		sd.select();
		List<Student> lst = sd.select();
		for (Student stu : lst) {
			System.out.println(stu);
		}
	}
}
