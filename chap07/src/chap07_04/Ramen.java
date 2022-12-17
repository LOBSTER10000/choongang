package chap07_04;

public class Ramen extends Bob{
	//필드
	
	//생성자
	
	public Ramen(int max, int time) {
		super(max, time);
	}
	
	@Override
	public boolean roll() {
		++accmulted;
		if(accmulted<max) {
			System.out.println(time + "시간째 버티는 중입니다 : " + (max-accmulted)+ "시간 = 앞으로 폭발까지 남은 시간입니다.");
			return true;
		} else {
			System.out.println("****" + time + "이제 더 이상 참을 수 없습니다 밥먹으러 갑시다 ****");
			return false;
		}
	}
	
	
}
