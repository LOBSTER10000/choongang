package chap06;
class Ddd{
	
}


public class Ccc {
	Ddd a; //다른 클래스에 필드를 만듦.
	
	Ccc(Ddd d){
		a = d; // Ddd라는 클래스의 a와 d를 같게함
	}
	public Ccc(int i, String string) {
		
	}
	void mmm(Ddd d) {
		a = d;
	}
	
	public static void main(String[] args) {
//		Ccc c = new Ccc();
		Ddd d1 = null;
		Ccc c1 = new Ccc(10, new String("가나다"));
		Ccc c = new Ccc(new Ddd());
		Ddd d = new Ddd();
//		c.a = d;
		c.mmm(d);
	}
}
