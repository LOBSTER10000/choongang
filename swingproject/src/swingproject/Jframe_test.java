package swingproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class Jframe_test extends JFrame{
	private static String one;

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		JPanel jp = new JPanel();
		
		//새로운 jframe을 만들어서 jf란 이름으로 사용할 수 있게 해달라
		
//		jf.setBounds(150, 100, 400, 200);
//		//jf의 setbounds 좌표와 크기를 지정하는 것
		
		jf.setSize(500,300);
//		jf.setLocation(400,200);
		
		jf.setTitle("로그인하세요");
		//jf의 제목을 테스트입니다로 설정
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// jf의 기본적인 x버튼을 누르면 어떻게 작동할것인지 구현 -> 나간다
		
		jf.setVisible(true);
		//jf가 보이게 한다
		
		jf.setLayout(null);
		
		jf.setLocationRelativeTo(null); // 가운데서 프레임 실행
		jf.setResizable(false);
		
		JMenu jm = new JMenu();
		jm.setLocation(10,10);
		jm.setVisible(true);
		
		JLabel jl = new JLabel();
		
		jl.setSize(80,30);
		jl.setLocation(30,30);
		jl.setHorizontalAlignment(JLabel.CENTER);
		jl.setText("아이디 :");
		jl.setVisible(true);
		jf.add(jl); //실제로 추가를 해줘야함
	
		
		JTextField jt = new JTextField();
		jt.setSize(130, 30);
		jt.setLocation(110,30);
		jf.add(jt);
		jt.setVisible(true);
		
		jl = new JLabel("비밀번호 :");
		jl.setSize(80,30);
		jl.setLocation(30,70);
		jf.add(jl);
		jl.setVisible(true);

		JPasswordField password = new JPasswordField();
		password.setSize(130, 30);
		password.setLocation(110,70);
		password.setVisible(true);
		jf.add(password);
		
		JButton jb = new JButton("로그인");
		jb.setSize(100,30);
		jb.setLocation(40, 130);
		jb.setVisible(true);
		jf.add(jb);
		jb.setBackground(new java.awt.Color(51, 153, 255));
        jb.setFont(new java.awt.Font("휴먼매직체", 0, 14));
		jb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String id = "lee";
				String pass = "1234";
				if(id.equals(jt.getText()) && pass.equals(password.getText())) {
					JOptionPane.showMessageDialog(null, "로그인에 성공했습니다");
				} else {
					JOptionPane.showMessageDialog(null, "로그인에 실패했습니다");
				}
				
			}
			
		});
		
		jb = new JButton("초기화");
		jb.setSize(100,30);
		jb.setLocation(150, 130);
		jb.setVisible(true);
		jf.add(jb);
		jb.setBackground(new java.awt.Color(51, 153, 255));
        jb.setFont(new java.awt.Font("휴먼매직체", 0, 14));
		jb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
			
		});

		jb = new JButton("회원 가입");
		jb.setSize(100,30);
		jb.setLocation(380, 200);
		jb.setVisible(true);
		jb.setBackground(new java.awt.Color(51, 153, 255));
        jb.setFont(new java.awt.Font("휴먼매직체", 0, 14));
		jf.add(jb);
		
		while(true) {
			Calendar t = Calendar.getInstance();
			int hour = t.get(Calendar.HOUR);
			int min = t.get(Calendar.MINUTE);
			int sec = t.get(Calendar.SECOND);
			one= (hour+":"+min+":"+sec);
			jl.setText(one);
			try {
				Thread.sleep(100);
			} catch(Exception e) {}
		}
		
	}
}
