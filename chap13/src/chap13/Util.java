package chap13;

public class Util {
	public static <T> Box<T> boxing(T t){  //맨 앞에 있는 T는 boxing의 T에 대한 것을 의미한다
		Box<T> box = new Box<T>(); // box라는 클래스를 초기화
		box.setT(t); // private으로 설정된 Box클래스의 T라는 필드값을 세터로 가져온다
		return box; // 리턴값은 box 값을 리턴한다.
		
	}
}
