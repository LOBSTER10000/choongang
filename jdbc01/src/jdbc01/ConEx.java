package jdbc01;

public class ConEx {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("드라이버 성공");
	}
}
