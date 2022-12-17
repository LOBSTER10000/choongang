package chap07_04;

import chap07_04.Ramen;

public class MealtimeEx {
	public static void main(String[] args) {
		Mealtime mealtime = new Mealtime();
		
		for(int i=1; i<=5; i++) {
			int problemLocation =mealtime.run();
		
			switch(problemLocation) {
				case 1:
					System.out.println("배고픔을 이겨냅니다");
					mealtime.time4 = new Bob(5, 10);
					break;
			}
			System.out.println("---------------------");
		}
		
	}
}
