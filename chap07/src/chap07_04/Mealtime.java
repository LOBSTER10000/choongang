package chap07_04;

public class Mealtime{
	Bob time4 = new Bob(4, 5);
	
	//생성자
		//메소드
		int run() {
			System.out.println("밥을 안먹기 시작한지 오래되었습니다");
			if(time4.roll()==false) {
				stop(); return 1;
			} return 0;}
	
		void stop() {
			System.out.println("[밥을 먹기 시작합니다]"); //
			}
}
