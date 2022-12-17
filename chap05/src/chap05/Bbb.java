package chap05;

public class Bbb {
	static final double PI = 3.141592;
	final int b = 0; // final을 붙이면 상수로 변해서 값이 수정이 안됨
	void bbb() {
		System.out.println(b + 10);
	}
	public static void main(String[] args) {
		Bbb bbb = new Bbb();
		bbb.bbb();
	}

}
