package chap09;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
class Listener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("클릭!!");
		
	}
	
}


public class Win3 extends JFrame implements ActionListener{
	JButton jb = new JButton("클릭");
	Win3(){
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
		new Win3();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		jb.setBackground(new Color(130,130,130,130));
		jb.setLocation(180,30);
		JOptionPane.showMessageDialog(null, "확인합니다");
	}
	
}