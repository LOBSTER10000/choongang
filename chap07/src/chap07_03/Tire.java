package chap07_03;

public class Tire {
		//필드
		public int maxRotation; //최대 회전수
		public int accmulatedRotation; // 누적 회전수
		public String location;  // 타이어의 위치
		
		//생성자
		public Tire(String location, int maxRotation) {
			
			this.location = location;
			this.maxRotation = maxRotation;
		}
		
		//메소드
		public boolean roll() {
			++accmulatedRotation; // 누적 회전수 증가
			if(accmulatedRotation < maxRotation) {
				System.out.println(location + "tire 수명 :" + (maxRotation-accmulatedRotation) + "회");
				return true; // 정상회전(누적<최대)일 경우 실행
			} else {
				System.out.println("***" + location + "tire 펑크 ***");
				return false; // 펑크(누적=최대)일 경우 실행
			}
		}
}
