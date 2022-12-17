package swingproject;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Frame {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		JPanel jp = new JPanel();
		JLabel jl = new JLabel();
		JButton jb1 = new JButton("로그인");
		JButton jb2 = new JButton("초기화");
		JTextArea jta = new JTextArea();
		JTextField jt = new JTextField();
		JPanel jp1 = new JPanel();
		
		
		jp.setLayout(new BorderLayout());
		jp.add(new JLabel("로그인 부탁드립니다"));
		
		jp1.add(jb2);
		jp1.add(jb1);
		jp.add(jp1, BorderLayout.WEST);
		jp.add(jl, BorderLayout.NORTH);
		jp.add(jta, BorderLayout.CENTER);
		jf.add(jp);
		
		
		jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jta.append("정말 어렵습니다\n");
				
			}
			
		});
		
		jb2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
			
		});
		
		
		jf.setResizable(false);
		jf.setVisible(true);
		jf.setPreferredSize(new Dimension(840, 840/12*9));
		jf.setSize(840, 840/12*9);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
} 
