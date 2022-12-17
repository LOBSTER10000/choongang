package swingproject;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.Timer;
import javax.swing.JLabel;

public class DigitalClock extends JFrame{
	
	
	Timer timer;

	public DigitalClock(){
		
		JLabel JLabel1 = new JLabel("New label");
		JLabel1.setBounds(66, 80, 229, 104);
		getContentPane().add(JLabel1);
		setSize(730, 450);
		setTitle("Study Viral - Digital Clock");
		getContentPane().setLayout(null);
		ActionListener actionListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Date date = new Date();
				DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
				String time = timeFormat.format(date);
				JLabel1.setText(time);
			}
			
		};
		timer = new Timer(1000, actionListener);
		timer.setInitialDelay(0);
		timer.start();
	}
	
	public static void main(String[] args) {
		
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
			DigitalClock dc = new DigitalClock();
			dc.setVisible(true);
		}});
		}
	}