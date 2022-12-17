package chap07;

public class ExtendsEx {
	
	public static void main(String[] args) {
		Bbb bb = new Bbb(); // 상속받은 자식 요소의 Bbb의 클래스를 불러옴
		System.out.println(bb.getX()); // 상속받은 자식요소의 int x 를 불러옴(부모요소임)
	}
}
