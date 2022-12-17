package chap10;

public class ArrayIndexOutOfBoundExceptionEx {
	public static void main(String[] args) {
		if (args.length == 1) {
			String data1 = args[0];
			System.out.println("args[0] : " + data1);
		} else {
			System.out.println("args[0]에 값이 없음");
		}

		try {
			String data = null;
			System.out.println(data.toString());
		} catch(NullPointerException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
			String data = "test";
			System.out.println(data.toString());
		}
		//		String data2 = args[1];
		
//		System.out.println("args[1] : " + data2);
	}
}
