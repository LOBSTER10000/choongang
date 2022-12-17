package chap08_01;

public interface RemoteControl {
	//상수
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//추상 메소드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	//디플트 메소드 //재정의 가능하다
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리 합니다");
		} else {
			System.out.println("무음해제 합니다");
		}
	}
	
	//정적메소드
	static void chaneBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
