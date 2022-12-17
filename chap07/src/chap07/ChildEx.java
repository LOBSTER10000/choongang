package chap07;

public class ChildEx{
	public static void main(String[] args) {
//		Parent pa = new Child();
//		Child ch = new Parent(); // 자식 개체에서 부모개체 만들기는 안됨
		Child ch = new Child();
		
		Parent parent = ch;
		parent.method();
		parent.method2();
//		parent.method3(); 자식요소와 적용이 안됨
		ch.method2();
		ch.method3();
	}
}
