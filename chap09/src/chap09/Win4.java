package chap09;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;

public class Win4 extends JFrame implements ActionListener{
	class Listener implements ActionListener{
	
	
		@Override
		public void actionPerformed(ActionEvent e) {
			jb.setText("클릭하지마세요");
			jb.setLocation(180,30);
			JOptionPane.showMessageDialog(null, "확인합니다");
			
		}
		
	}
	JButton jb = new JButton("클릭");
	Win4(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		con.setLayout(null);
		jb.setBounds(100,30,80,40);
		con.add(jb);
		jb.addActionListener(new Listener());
		this.setLocation(500, 400);
		this.setSize(400,300);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Win4();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		jb.setBackground(new Color(0,0,0,0));
//		jb.setLocation(180,30);
//		JOptionPane.showMessageDialog(null, "확인합니다");
	}
	
}
