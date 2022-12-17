package chap07_06;

public class ChildEx {
	public static void main(String[] args) {
		Parent parent = new Parent();
		boolean result = parent instanceof Child;
		if (result) {
			Child child = (Child) parent;
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		/*
		parent.field2 = "data2";
		parent.method3();
		*/
		
		Child child = (Child) parent;
		child.field2 = "yyy";
		child.method3();
	}
}
