package chap06;

public class Baa {
	
	int a;
	
	void bbb() {
		System.out.println('a');
	}// void는 return을 호출하지 않음
	
	
	int ccc() {
		return a + 10;
	}//
	
	
	void ddd(int a) {
		this.a = a*10;
//		System.out.println(this.a);
//		bbb();
		this.bbb();
	}
	

	int eee(int a) {
		return a * 20;
	}
}
