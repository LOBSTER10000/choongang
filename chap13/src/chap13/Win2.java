package chap13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Win2 extends JFrame{
	
	JButton jb1 = new JButton("새창");
	JFrame jf1;
			Win2(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		c.add(jb1);
		this.setBounds(500,500,400,300);
		this.setVisible(true);
		
		jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jf1 = new Win3();
				
				
			}
			
		});
	}
	public static void main(String[] args) {
		new Win2();
	}
}
