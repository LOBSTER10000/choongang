package chap13;

public class BoxEx {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.setT("홍길동");
		String name = (String) box.getT();
		
//		----------------------------------
		Box<Apple> box1 = new Box<Apple>();
		//Box라는 클래스 안에 필드에 String이라는 필드값을 가지고있음
		box1.setT(new Apple());
		Apple apple = (Apple) box1.getT();
	}
}
