package chap09_02;

public class A {
	void m() {
		
	}
}

//class B extends A{
//}
class C{
//	A a = new C() {
//		void m() {
//			
//		}
//	};
	void mc3() {
		A a2 = new A() {

			@Override
			void m() {
				// TODO Auto-generated method stub
				super.m();
			}
			
		};
		
	}
	A a1 = new A() {

		@Override
		void m() {
			// TODO Auto-generated method stub
			super.m();
		}
		
	};
	
	void mcl(A a) {
		
	}
	void mc2() {
		A a2 = new A();
		mcl(a2);
	}
	
}
