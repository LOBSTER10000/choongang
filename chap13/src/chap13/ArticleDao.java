package chap13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextField;

public class ArticleDao {
	Connection conn;
	PreparedStatement pstm;
	ResultSet rs;
	
	String id;
	
	
	ArticleDao(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/thisisjava", "java", "mysql");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	int insert(Article art) {
		String sql = 
			"insert into Article(writer, title, content, count)"
			+ " values (?,?,?,?)";
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, art.writer);
			pstm.setString(2, art.title);
			pstm.setString(3, art.content);
			pstm.setInt(4, art.count);
			return pstm.executeUpdate();

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

	int delete(int id) {
		String sql = "delete from Article where id = ?";
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			return pstm.executeUpdate();

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
	
	int update(Article art) {
		String sql = "update Article "
				+ "set writer = ?, title = ?, content = ?, count = ?"
				+ " where id = ?";
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, art.writer);
			pstm.setString(2, art.title);
			pstm.setString(3, art.content);
			pstm.setInt(4, art.count);
			pstm.setInt(5, art.id);
			return pstm.executeUpdate();

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
	
	List<Article> selectAll(){
		List<Article> list = new ArrayList<Article>();
		String sql = "select id, writer, title, content, count from article";
		try {
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while(rs.next()) {
				int id = rs.getInt(1);
				String writer = rs.getString(2);
				String title = rs.getString(3);
				String content = rs.getString(4);
				int count = rs.getInt(5);
				list.add(new Article(id, writer, title, content, count));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
				
	};
	
	public static void main(String[] args) {
		ArticleDao dao = new ArticleDao();
//		List<Article> list = dao.selectAll();
//		for(Article art : list) {
//			System.out.println(art);
//		}
		
		List<Article> list1 = new ArrayList<Article>();
		for (int i = 0; i < 10; i++) {
			Article art2 = new Article(0, "강"+i, "함"+i, "유"+i, 0);
			list1.add(art2);
		}
		System.out.println(list1);
		
		list1.stream().forEach((n)->System.out.println(dao.insert(n)));
		
//		list.stream().forEach(n->System.out.println(n));
//		dao.insert(list);
//		System.out.println(list);
	}
	
	void connect() {
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
	
	void search() {
		List<Article> list = new ArrayList<Article>();
		String sql = "SELECT * FROM article where id = '"+id+"'";
		try {
			pstm = conn.prepareStatement(sql);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void id(JTextField tf) {
		this.id = id;
		
	}
}

