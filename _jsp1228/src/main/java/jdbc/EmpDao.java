package jdbc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EmpDao {
	private Connection conn = getConnect();

	private static EmpDao empDao = new EmpDao();

	public static EmpDao getInstance() {
		return empDao;
	}

	private EmpDao() {
	}

	private Connection getConnect() {
		try {
			Properties prop = new Properties();
			String path = EmpDao.class.getResource("db.properties").getPath();
			try {
				path = URLDecoder.decode(path, "utf-8");
			} catch (UnsupportedEncodingException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				prop.load(new FileReader(path));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String driver = prop.getProperty("driver");
			System.out.println(driver);
			Class.forName(driver);
			String url = prop.getProperty("url");
			System.out.println(url);
			String user = prop.getProperty("user");
			System.out.println(user);
			String pw = prop.getProperty("pw");
			System.out.println(pw);
//			String url = "jdbc:oracle:thin:@localhost:1521:xe";
//			String user = "scott", pw = "tiger";
			Connection conn = DriverManager.getConnection(url, user, pw);
			return conn;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
	public Emp select(int num) {
		String sql = "select * from emp where empno = ?";
		Emp emp = null;
		try {
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setInt(1, num);
			ResultSet rs = pstm.executeQuery();
			if (rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int deptno = rs.getInt("deptno");
				int sal = rs.getInt("sal");
				String hiredate = rs.getString("hiredate");
				int mgr = rs.getInt("mgr");
				int comm = rs.getInt("comm");
//				System.out.printf("%d %s %s %d %d\n", empno, ename, job, deptno, sal);
				emp = new Emp(empno, ename, job, mgr, hiredate, sal, comm, deptno);

			}
			rs.close();
			pstm.close();
			return emp;
			
//			return 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}
	public List<Emp> selectAll(int num) {
		List<Emp> lst = new ArrayList<>();
		
		String sql = null;
		switch(num) {
		case 0:  // 정렬 안함
			sql = "select * from emp";
			break;
		case 1:  // 부서별 오름차순
			sql = "select * from emp order by deptno";
			break;
		case 2:  // 부서별 내림차순
			sql = "select * from emp order by deptno desc";
			break;
		}
		try {
			PreparedStatement pstm = conn.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int deptno = rs.getInt("deptno");
				int sal = rs.getInt("sal");
				String hiredate = rs.getString("hiredate");
				int mgr = rs.getInt("mgr");
				int comm = rs.getInt("comm");
//				System.out.printf("%d %s %s %d %d\n", empno, ename, job, deptno, sal);
				Emp emp = new Emp(empno, ename, job, mgr, hiredate, sal, comm, deptno);
				lst.add(emp);
			}
			rs.close();
			pstm.close();
			return lst;
			
//			return 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}
	
	
	public List<Emp> realSelectAll(){
		List<Emp> lst = new ArrayList<>();
		
		String sql = "select * from emp";
		try {
			PreparedStatement pstm = conn.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			while(rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int deptno = rs.getInt("deptno");
				int sal = rs.getInt("sal");
				String hiredate = rs.getString("hiredate");
				int mgr = rs.getInt("mgr");
				int comm = rs.getInt("comm");
				Emp emp = new Emp(empno, ename, job, mgr, hiredate, mgr, comm, deptno);
				lst.add(emp);
			}
			rs.close();
			pstm.close();
			return lst;
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Emp> selectDeptno() {
		List<Emp> lst = new ArrayList<>();
		
		String sql ="select deptno from emp group by deptno order by deptno";
		try {
			PreparedStatement pstm = conn.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				int empno = 0;
				String ename = null;
				String job = null;
				int deptno = rs.getInt("deptno");
				int sal = 0;
				String hiredate = null;
				int mgr = 0;
				int comm = 0;
//				System.out.printf("%d %s %s %d %d\n", empno, ename, job, deptno, sal);
				Emp emp = new Emp(empno, ename, job, mgr, hiredate, sal, comm, deptno);
				lst.add(emp);
			}
			rs.close();
			pstm.close();
			return lst;
			
//			return 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}
	
	public static void main(String[] args) {
		EmpDao ed = EmpDao.getInstance();
//		for (Emp emp : ed.selDeptSvg()) {
//			System.out.println(emp);
//		}
		
		List<Emp> list = ed.selectAll(0);
//		list.stream().forEach(n-> System.out.println(n));
		double avg = 
		list.stream().filter(n->n.getDeptno()==20).mapToInt(Emp::getSal).average().getAsDouble();
		System.out.println(avg);
		
		list.stream().filter(n->n.getDeptno()==20).forEach(x->System.out.println(x));
		
		List<Emp> list1 = ed.selectDeptno();
		int deptno  = 
				list1.get(0).getDeptno();
		System.out.println(deptno);
		
	}

}
