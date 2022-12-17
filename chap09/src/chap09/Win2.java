package chap09;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToggleButton;

public class Win2 extends JFrame implements ActionListener{
	JToggleButton jb = new JToggleButton("클릭");
	Win2(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		con.setLayout(null);
		jb.setBounds(100,30,80,40);
		con.add(jb);
		jb.addActionListener(this);
		this.setLocation(500, 400);
		this.setSize(400,300);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Win2();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		jb.setBackground(new Color(130,130,130,130));
		jb.setLocation(180,30);
	}
	
}