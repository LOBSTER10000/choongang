package chap14;

public class MyFunctionalInterfaceEx {
	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		fi = (x, y)->{
				return x+y;
			
		};
		System.out.println(fi.method(20, 30));
		
	}
}
