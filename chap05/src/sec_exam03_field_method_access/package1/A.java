package sec_exam03_field_method_access.package1;

public class A {
	//필드
	public int field1;
	int field2;
	private int field3;

	public int getField3() {
		return field3;
	}

	public void setField3(int field3) {
		this.field3 = field3;
	}

	//생성자
	public A() {
		field1 = 1;
		field2 = 1;
		field3 = 1;
		
		method1();
		method2();
		method3();
	}
	
	//메소드
	
	public void method1() {};
	void method2() {};
	private void method3() {};
}
