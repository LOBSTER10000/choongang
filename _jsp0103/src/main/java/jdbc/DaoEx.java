package jdbc;

public class DaoEx {
	
	public static void main(String[] args) {
		Dao dao = Dao.getInstance();
		String lst = dao.selectEmpJson();
		System.out.println(lst);
	}
}
