package chap10;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.time.LocalDateTime;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Win extends JFrame {
	JLabel jl = new JLabel("여기");
	JTextField jf = new JTextField("검색", 10);
	JButton jb = new JButton("클릭");
	
	
	
	Win() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container co = this.getContentPane();
		this.setVisible(true);
		this.setBounds(500, 250, 800, 600);
		this.setLayout(null);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		jf.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				jf.setText("");

			}

			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub

			}

		});

		jb.addActionListener((e)-> {

			
				try {
					jb.setBackground(new Color(0, 0, 0));
					int num = Integer.parseInt(jf.getText());
					
					if(num >=100) {
						throw new MyNumException("100 미만");
					} else {
						JOptionPane.showMessageDialog(null , num);
					}
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null , "숫자만 입력");

				} catch(MyNumException e2) {
					JOptionPane.showMessageDialog(null , "예외 발생");
				}
				
				finally {
					JOptionPane.showMessageDialog(null , "항상 실행합니다");
				}
			

		});

		co.add(jf);
		co.add(jl);
		co.add(jb);

		co.setLayout(new FlowLayout());
		
		Thread th2 = new Thread() {
			public void run() {
				while(true) {
					LocalDateTime now = LocalDateTime.now();
					jl.setText(now.getMonth() + " " +now.getDayOfMonth() + " " + now.getYear() + " " + 
							now.getHour() + " 시 " + now.getMinute() + " 분 " + now.getSecond() + " 초 ");
				}
			} 
		}; 
		th2.start();
	}

	public static void main(String[] args) {
		new Win();

	}
	
	


}
