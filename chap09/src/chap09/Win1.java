package chap09;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Win1 extends JFrame{
	JButton jb = new JButton("클릭");
	Win1(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		con.setLayout(null);
		jb.setBounds(100,30,80,40);
		con.add(jb);
		this.setLocation(500, 400);
		this.setSize(400,300);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Win1();
	}
}
