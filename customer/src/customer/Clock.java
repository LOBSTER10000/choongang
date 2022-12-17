package customer;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.Graphics;
import java.awt.Font;
import java.lang.Thread;

class Clock extends Frame implements Runnable
{

	public Clock(){
	
		setFont(new Font("고딕", Font.BOLD,36));
		setBounds(250,200,400,100);
		setVisible(true);
		
		Thread thread = new Thread(this); //스레드 생성
		thread.start();

	}

	public void paint(Graphics g){
			SimpleDateFormat sdf = new SimpleDateFormat("a hh시 mm분 ss초");
			Date d = new Date();
			g.drawString(sdf.format(d),40,80);
		}



	@Override
	public void run(){
		while(true){
			repaint(); //과부화가 걸릴수 있다 계속해서 객체를 만들고 지우고 만들고 지우고 

			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) 
	{
		new Clock();
	}
}
