package chap09;

public class Parent {
	void parentethod() {
		
	}
}

class Child extends Parent{}
class A {
	Parent field = new Parent() {

		@Override
		void parentethod() {
			// TODO Auto-generated method stub
			super.parentethod();
		}
		
	};
	
	void method1(Parent parent) {
		
	}
	void method2() {
		method1(new Parent());
	}
	void method() {
		Parent localVar = new Child();
	}
}
