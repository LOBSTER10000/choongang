package chap08_01;

public class Television implements RemoteControl{
	//필드
	private int volume;
	
	//trunOn() 추상 메소드의 실체 메소드
	@Override
	public void turnOn() {
		System.out.println("티비를 켭니다");
	}
	//turnOff() 추상메소드의 실체 메소드
	@Override
	public void turnOff() {
		System.out.println("티비를 끕니다");
	}
	
	
	//setVolume()
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume>RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}
}
