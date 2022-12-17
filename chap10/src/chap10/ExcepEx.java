package chap10;

public class ExcepEx {
	public static void main(String[] args) {
		try {
		test();
		}
		catch(CustomException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	private static void test() throws CustomException{
		// TODO Auto-generated method stub
		throw new CustomException("예외테스트입니다");
	}
}
