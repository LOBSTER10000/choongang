package chap13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Win extends JFrame{
	
	JButton jb1 = new JButton("새창");
	JFrame jf1;
			Win(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		c.add(jb1);
		this.setBounds(500,500,400,300);
		this.setVisible(true);
		
		jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jb1.setEnabled(false);
				jf1 = new JFrame("새창");
				JButton jb2 = new JButton("닫기");
				Container c = jf1.getContentPane();
				c.setLayout(new FlowLayout());
				c.add(jb2);
				jf1.setBounds(500,500,400,300);
				jf1.setVisible(true);
				
				jb2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						jf1.setVisible(false);
						jb1.setEnabled(true);
						
					}
					
				});
			}
		});
	}
	
	public static void main(String[] args) {
		new Win();
	}
}

