package swingproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame{
	public Login() {
		JPanel panel = new JPanel();
		JTextField txtid = new JTextField(10);
		JLabel label1 = new JLabel("아이디 :");
		JPasswordField password = new JPasswordField(10);
		JLabel label2 = new JLabel("비밀번호 :");
		JButton jb1 = new JButton("로그인");
		
		
		panel.add(label1);
		panel.add(txtid);
		panel.add(label2);
		panel.add(password);
		panel.add(jb1);
		
		jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String id = "lee";
				String pass = "1234";
				
				if(id.equals(txtid.getText()) && pass.equals(password.getText())) {
					JOptionPane.showMessageDialog(null, "로그인에 성공했습니다");
				} else {
					JOptionPane.showMessageDialog(null, "로그인에 실패했습니다");
				}
				
			}
			
		});
		add(panel);
		
		
		setSize(600,400);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Login();
	}
}
