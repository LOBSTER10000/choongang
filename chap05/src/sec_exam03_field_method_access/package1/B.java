package sec_exam03_field_method_access.package1;

public class B {
	public B() {
		A a = new A();
		a.field1 = 1;
		a.field2 = 1;
//		a.field3 = 1; //private 접근제한이라 사용 불가
		a.getField3();
		a.setField3(1);
		
		a.method1();
		a.method2();
//		a.method3(); // private 접근제한이라 사용불가
	}
}
