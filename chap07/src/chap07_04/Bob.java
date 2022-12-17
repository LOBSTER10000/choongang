package chap07_04;

public class Bob {
	int max;
	int accmulted;
	int time;
	
	
	public Bob(int max, int time) {
		this.max = max;
		this.time = time;
	}
	
	public boolean roll() {
		++accmulted;
		if(accmulted<max) {
			System.out.println(accmulted + "시간 = 지금 안먹고 버틴시간입니다. " +(max-accmulted) +"시간 동안 아직 더 버틸 수 있습니다");
			return true;
		} else if(accmulted==max) {
			System.out.println("이제 더 이상 참을 수 없습니다 밥먹으러 갑시다");
			return false;
		}
		return true;
	}
	
	
}
