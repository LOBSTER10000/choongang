package chap08_01;

public class MyClassEx {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("냉장고를 켜다");
				
			}

			@Override
			public void turnOff() {
				System.out.println("냉장고를 끄다");
				
			}

			@Override
			public void setVolume(int volume) {
					
				
			}
			
		};
	}
}
