package chap08_01;

public class Car {
	Tire[] tire;
	int[] num = {1,2,3,4};
	int[] num2;
	
	Car(){
		tire = new Tire[]{new HankookTire(),
				new HankookTire(),
				new HankookTire(),
				new HankookTire()};
		num2 = new int[] {2,3,4,5};
		}
		
		
		void run() {
			for(int i = 0; i < tire.length; i++) {
				tire[i].roll();
			} 
			System.out.println("---------------");
//			for(int i = 0;)
		}
	}

