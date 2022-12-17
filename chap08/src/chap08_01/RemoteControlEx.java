package chap08_01;

public class RemoteControlEx {
	public static void main(String[] args) {
		SmartTelevision st = new SmartTelevision();
		st.turnOn();
		st.turnOff();
		st.search("https://www.apple.com");
		st.setVolume(8);
		
		
		RemoteControl rc2 = new RemoteControl() {

			@Override
			public void turnOn() {
				// TODO Auto-generated method stub (//실행문)
				
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub (실행문)
				
			}

			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub (실행문)
				
			}
			
		}; 
		
		
		// 위와 동일한 내용
		// 인터페이스 정의한것을 불러올수 있음 
		//생성하는 방법
//		RemoteControl rc;
//		rc = new Television(); // 인터페이스를 불러와서 새로운 텔레비전의 클래스를 불러옴
//		rc = new Audio(); 
		
	}
}
