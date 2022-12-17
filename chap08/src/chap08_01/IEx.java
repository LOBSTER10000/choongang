package chap08_01;

public class IEx{
		
	public static void main(String[] args) {
//		I.d();
		I i = new I() {
			public void d() {
				System.out.println("dd");
			}
		};
		i.d();
		ISon is = new ISon();
		is.d();
		
		
	}

}
