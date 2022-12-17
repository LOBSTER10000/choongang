package chap12;

import java.awt.Toolkit;

public class BeepEx {
	public static void main(String[] args) {

		Thread th = new BeepTask();
		th.start();

		Thread th2 = new Thread() {
			Toolkit toolkit = Toolkit.getDefaultToolkit();

			public void run() {
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
					}
				}
			}
		};
		th2.start();

		Runnable th3 = new BeepTask2();
		th3.run();

		Thread th4 = new Thread(th3);
		th4.start();
		
		
		//5번
		Thread th5 = new Thread(new Runnable() {

			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
					}
				}
				
			}
			
		}); 
		th5.start();

		// 람다식 방법 메소드는 하나밖에 못함
		Thread th6 = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for (int i = 0; i < 5; i++) {
				toolkit.beep();
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
			}
		});
		th6.start();
	}
}
