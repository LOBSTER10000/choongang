package chap10;

public class TryEx {

	public static void main(String[] args) throws ClassNotFoundException {
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
//			System.out.println("예외상황!");
		} //Class.forName("java.lang.String2") -> 자바.lang에 스트링2라는 파일이 있는지 없는지 파악해라 

		
		Class clapp = Class.forName("java.lang.String2"); // throws로 던져서 예외로 만들기 시작
	} 

}
