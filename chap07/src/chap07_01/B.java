package chap07_01;

//public class B extends A{
//	public B() {
//		super();
//		this.field = "value";
//		this.method();
//	} // 상속을 받은 후 생성자 불러오면 부모의 필드값 정의 가능
//}


public class B{	
	public void method() {
		A a = new A();
		a.field = "value";
		a.method();  // class a와 상속관계가 아니므로 생성자 불러와서 기능 적는 것이 가능
	}
}
