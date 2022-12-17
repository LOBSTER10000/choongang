package chap07;

class Ddd{
	int a = 100;
}

public class Ccc extends Ddd {
	public static void main(String[] args) {
		Ccc cc = new Ccc();
		System.out.println(cc.a);
	}
}
