package studypro;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class Wlogin2 extends JFrame {

	protected static final int YES_NO_OPTION = 0;

	protected static final int NO = 0;

	protected static final int YES = 0;

	protected static final int YES_OPTION = 0;

	protected static final int NO_OPTION = 0;

	private Map<String, String> map;
	Customer2 customer2;

	DBUpdate2 dbUpdate2 = new DBUpdate2();

	private JFrame frame;

	private JTextField textField;

	private JPasswordField passwordField;

	private JTextField textField_1;

	private JTextField textField_2;

	private JPasswordField passwordField_1;

	private String one;

	private String two;

	private JTextField textField_4;

	private JTextField textField_5;

	private Thread t1;

	protected String uid1 = "";

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {

					Wlogin2 window = new Wlogin2();

					window.frame.setVisible(true);

				} catch (Exception e) {

					e.printStackTrace();

				}

			}

		});

	}

	public Wlogin2() {

		initialize();

	}

	private void initialize() {

		customer2 = new Customer2();
//-------------Swing----------------------------------------------------------------------------
		frame = new JFrame();

		frame.setBounds(100, 100, 1200, 850);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().setLayout(null);

		frame.setResizable(false);

		frame.setLocationRelativeTo(null);

		// panel3 초기화면
		JPanel panel3 = new JPanel();

		panel3.setBounds(0, 0, 1184, 811);

		frame.getContentPane().add(panel3);
		panel3.setVisible(true);
		panel3.setLayout(null);

		JButton p3_btnEnt = new JButton("입실");

		p3_btnEnt.setForeground(new Color(255, 255, 255));

		p3_btnEnt.setBackground(new Color(0, 128, 255));

		p3_btnEnt.setFont(new Font("HY견고딕", Font.PLAIN, 30));

		p3_btnEnt.setBounds(190, 331, 236, 225);

		panel3.add(p3_btnEnt);

		JButton p3_btnLeave = new JButton("퇴실");

		p3_btnLeave.setForeground(new Color(255, 255, 255));

		p3_btnLeave.setBackground(new Color(0, 128, 255));

		p3_btnLeave.setFont(new Font("HY견고딕", Font.PLAIN, 30));

		p3_btnLeave.setBounds(510, 331, 236, 225);

		panel3.add(p3_btnLeave);

		JButton p3_btnCurSeat = new JButton("좌석 현황");

		p3_btnCurSeat.setForeground(new Color(255, 255, 255));

		p3_btnCurSeat.setBackground(new Color(0, 128, 255));

		p3_btnCurSeat.setFont(new Font("HY견고딕", Font.PLAIN, 30));

		p3_btnCurSeat.setBounds(834, 331, 236, 225);

		panel3.add(p3_btnCurSeat);

		JButton p3_btnAdmin = new JButton("관리자 페이지");

		p3_btnAdmin.setForeground(new Color(255, 255, 255));

		p3_btnAdmin.setBackground(new Color(0, 128, 255));

		p3_btnAdmin.setFont(new Font("HY견고딕", Font.PLAIN, 30));

		p3_btnAdmin.setBounds(923, 707, 236, 79);

		panel3.add(p3_btnAdmin);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 128, 255));
		panel_4.setBounds(0, 0, 1155, 59);
		panel3.add(panel_4);
		panel_4.setLayout(null);

		JLabel lbTime1 = new JLabel("New label");
		lbTime1.setBounds(884, -19, 284, 119);
		panel_4.add(lbTime1);
		lbTime1.setFont(new Font("HY견고딕", Font.PLAIN, 30));

		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBackground(Color.LIGHT_GRAY);
		panel_1_3.setBounds(0, 58, 1155, 31);
		panel3.add(panel_1_3);
		panel_1_3.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(
				"C:\\Users\\admin\\Desktop\\temporary\\choongang\\swingproject2\\src\\studypro\\중앙스터디카페2.png"));
		lblNewLabel_1.setBounds(464, 99, 350, 210);
		panel3.add(lblNewLabel_1);

		// panel1 로그인화면

		JPanel panel1 = new JPanel();

		panel1.setBounds(0, 0, 1184, 811);

		frame.getContentPane().add(panel1);
		panel1.setLayout(null);
		panel1.setVisible(false);

		JLabel lbTime = new JLabel("New label");
		lbTime.setBounds(884, -19, 284, 119);

		lbTime.setFont(new Font("HY견고딕", Font.PLAIN, 30));

		panel1.add(lbTime);

		JLabel lbNumber = new JLabel("전화번호 :");
		lbNumber.setBounds(487, 382, 117, 39);

		lbNumber.setForeground(new Color(0, 128, 255));

		lbNumber.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		lbNumber.setVerticalAlignment(SwingConstants.TOP);

		panel1.add(lbNumber);

		JLabel lbPassword = new JLabel("비밀번호 :");
		lbPassword.setBounds(487, 473, 117, 39);

		lbPassword.setVerticalAlignment(SwingConstants.TOP);

		lbPassword.setForeground(new Color(0, 128, 255));

		lbPassword.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		panel1.add(lbPassword);

		textField = new JTextField();
		textField.setBounds(647, 384, 139, 25);

		panel1.add(textField);

		textField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(647, 475, 139, 25);

		panel1.add(passwordField);

		JButton btnLogin = new JButton("로그인");
		btnLogin.setBounds(453, 579, 139, 39);

		btnLogin.setBackground(new Color(0, 128, 255));

		btnLogin.setForeground(new Color(255, 255, 255));

		btnLogin.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		panel1.add(btnLogin);

		JButton btnReset = new JButton("초기화");
		btnReset.setBounds(683, 579, 139, 39);

		btnReset.setBackground(new Color(0, 128, 255));

		btnReset.setForeground(new Color(255, 255, 255));

		btnReset.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		panel1.add(btnReset);

		JButton btnSignUp = new JButton("회원가입");
		btnSignUp.setBounds(910, 693, 176, 52);

		btnSignUp.setBackground(new Color(0, 128, 255));

		btnSignUp.setForeground(new Color(255, 255, 255));

		btnSignUp.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		panel1.add(btnSignUp);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1155, 59);

		panel.setBackground(new Color(0, 128, 255));

		panel1.add(panel);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 58, 1155, 31);

		panel_1.setBackground(new Color(192, 192, 192));

		panel1.add(panel_1);

		JButton btnSignUp_1 = new JButton("뒤로");

		btnSignUp_1.setForeground(Color.WHITE);
		btnSignUp_1.setFont(new Font("HY견고딕", Font.PLAIN, 20));
		btnSignUp_1.setBackground(new Color(0, 128, 255));
		btnSignUp_1.setBounds(910, 125, 176, 52);
		panel1.add(btnSignUp_1);

		JLabel lblNewLabel_1_2 = new JLabel("New label");
		lblNewLabel_1_2.setIcon(new ImageIcon(
				"C:\\Users\\admin\\Desktop\\temporary\\choongang\\swingproject2\\src\\studypro\\중앙스터디카페2.png"));
		lblNewLabel_1_2.setBounds(475, 130, 350, 210);
		panel1.add(lblNewLabel_1_2);
		// ------------------Swing끝-------------------------------------------

//panel2 회원가입화면

		JPanel panel2 = new JPanel();

		panel2.setBounds(0, 0, 1184, 811);

		frame.getContentPane().add(panel2);

		panel2.setVisible(false);

		panel2.setLayout(null);

		JLabel lbTime1_2 = new JLabel("New label");
		lbTime1_2.setFont(new Font("HY견고딕", Font.PLAIN, 30));
		lbTime1_2.setBounds(884, -19, 284, 119);
		panel2.add(lbTime1_2);

		JLabel lbSignUp = new JLabel("회원 가입");

		lbSignUp.setForeground(new Color(0, 128, 255));

		lbSignUp.setFont(new Font("HY견고딕", Font.PLAIN, 27));

		lbSignUp.setBounds(340, 48, 164, 84);

		panel2.add(lbSignUp);

		JLabel lbNumber2 = new JLabel("전화번호 :");

		lbNumber2.setForeground(new Color(0, 128, 255));

		lbNumber2.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		lbNumber2.setBounds(193, 174, 141, 36);

		panel2.add(lbNumber2);

		JLabel lbPassword2 = new JLabel("비밀번호 :");

		lbPassword2.setForeground(new Color(0, 128, 255));

		lbPassword2.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		lbPassword2.setBounds(193, 250, 141, 36);

		panel2.add(lbPassword2);

		JLabel lbName = new JLabel("이름 :");

		lbName.setForeground(new Color(0, 128, 255));

		lbName.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		lbName.setBounds(193, 325, 141, 36);

		panel2.add(lbName);

		textField_1 = new JTextField();

		textField_1.setBounds(327, 174, 186, 31);

		panel2.add(textField_1);

		textField_1.setColumns(10);

		textField_2 = new JTextField();

		textField_2.setColumns(10);

		textField_2.setBounds(327, 325, 186, 31);

		panel2.add(textField_2);

		passwordField_1 = new JPasswordField();

		passwordField_1.setBounds(327, 250, 186, 31);

		panel2.add(passwordField_1);

		JButton btnCreate = new JButton("생성");

		btnCreate.setBackground(new Color(0, 128, 255));

		btnCreate.setForeground(new Color(255, 255, 255));

		btnCreate.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		btnCreate.setBounds(192, 496, 151, 58);

		panel2.add(btnCreate);

		JButton btnCancel = new JButton("취소");

		btnCancel.setBackground(new Color(0, 128, 255));

		btnCancel.setForeground(new Color(255, 255, 255));

		btnCancel.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		btnCancel.setBounds(378, 496, 151, 58);

		panel2.add(btnCancel);

		// 회원가입-생성버튼 이벤트
		btnCreate.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				String unumber = textField_1.getText();

				String upass = passwordField_1.getText();

				String uname = textField_2.getText();

				if (unumber.equals("") || upass.equals("") || uname.equals("")) {

					JOptionPane.showMessageDialog(null, "모든 정보를 기입해주세요", "회원가입 실패", JOptionPane.ERROR_MESSAGE);

					System.out.println("회원가입 실패 > 회원정보 미입력");

				}

				else if (upass != null && uname != null && unumber != null) {

					if (customer2.joinCheck(unumber, upass, uname)) {

						System.out.println("회원가입 성공");

						JOptionPane.showMessageDialog(null, "회원가입에 성공하였습니다");

						panel2.setVisible(false);
						panel3.setVisible(true);

					} else {

						System.out.println("회원가입 실패");

						JOptionPane.showMessageDialog(null, "회원가입에 실패하였습니다");

					}

				}

				panel1.setVisible(true);

				panel2.setVisible(false);

			}

		});

		// 회원가입-취소버튼 이벤트
		btnCancel.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "아이디 생성에 실패하셨습니다");

				panel1.setVisible(true);

				panel2.setVisible(false);

			}

		});

		// panel3.setVisible(false);

		// seatBtn3.addActionListener(new ActionListener() {

		// public void actionPerformed(ActionEvent e) {

		// int answer = JOptionPane.showConfirmDialog(null, "이 좌석을 선택하시겠습니까?", "확인창",

		// YES_NO_OPTION);

		// if (answer == JOptionPane.YES_OPTION) {

		// panel4.setVisible(false);

		// panel5.setVisible(true);

		// seatBtn3.setBackground(Color.red);

		// } else if (answer == JOptionPane.NO_OPTION) {

		// panel4.setVisible(true);

		// panel5.setVisible(false);

		// }

		// }

		// });

		// seatBtn4.addActionListener(new ActionListener() {

		// public void actionPerformed(ActionEvent e) {

		// panel4.setVisible(false);

		// panel5.setVisible(true);

		// }

		// });

		// panel4 좌석화면
		JPanel panel4 = new JPanel();

		panel4.setBounds(0, 0, 1184, 811);

		frame.getContentPane().add(panel4);

		panel4.setLayout(null);

		panel4.setVisible(false);

		// panel4 좌석화면_좌석버튼

		JButton seatBtn1 = new JButton("1");

		seatBtn1.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		seatBtn1.setBounds(110, 638, 80, 80);

		panel4.add(seatBtn1);

		JButton seatBtn2 = new JButton("2");

		seatBtn2.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		seatBtn2.setBounds(110, 553, 80, 80);

		panel4.add(seatBtn2);

		JButton seatBtn3 = new JButton("3");

		seatBtn3.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		seatBtn3.setBounds(110, 469, 80, 80);

		panel4.add(seatBtn3);

		JButton seatBtn4 = new JButton("4");

		seatBtn4.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		seatBtn4.setBounds(110, 382, 80, 80);

		panel4.add(seatBtn4);

		JButton seatBtn5 = new JButton("5");

		seatBtn5.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		seatBtn5.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		seatBtn5.setBounds(110, 298, 80, 80);

		panel4.add(seatBtn5);

		JButton seatBtn6 = new JButton("6");

		seatBtn6.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		seatBtn6.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		seatBtn6.setBounds(110, 214, 80, 80);

		panel4.add(seatBtn6);

		JButton seatBtn7 = new JButton("7");

		seatBtn7.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		seatBtn7.setBounds(191, 124, 80, 80);

		panel4.add(seatBtn7);

		JButton seatBtn8 = new JButton("8");

		seatBtn8.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		seatBtn8.setBounds(272, 124, 80, 80);

		panel4.add(seatBtn8);

		JButton seatBtn9 = new JButton("9");

		seatBtn9.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		seatBtn9.setBounds(352, 124, 80, 80);

		panel4.add(seatBtn9);

		JButton seatBtn10 = new JButton("10");

		seatBtn10.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		seatBtn10.setBounds(433, 124, 80, 80);

		panel4.add(seatBtn10);

		JButton seatBtn11 = new JButton("11");

		seatBtn11.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		seatBtn11.setBounds(514, 124, 80, 80);

		panel4.add(seatBtn11);

		JButton seatBtn12 = new JButton("12");

		seatBtn12.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		seatBtn12.setBounds(594, 124, 80, 80);

		panel4.add(seatBtn12);

		JButton seatBtn13 = new JButton("13");

		seatBtn13.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		seatBtn13.setBounds(673, 124, 80, 80);

		panel4.add(seatBtn13);

		JButton seatBtn14 = new JButton("14");

		seatBtn14.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		seatBtn14.setBounds(749, 124, 80, 80);

		panel4.add(seatBtn14);

		JButton seatBtn15 = new JButton("15");

		seatBtn15.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		seatBtn15.setBounds(830, 124, 80, 80);

		panel4.add(seatBtn15);

		JButton seatBtn16 = new JButton("16");

		seatBtn16.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		seatBtn16.setBounds(912, 124, 80, 80);

		panel4.add(seatBtn16);

		JButton seatBtn17 = new JButton("17");

		seatBtn17.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		seatBtn17.setBounds(999, 214, 80, 80);

		panel4.add(seatBtn17);

		JButton seatBtn18 = new JButton("18");

		seatBtn18.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		seatBtn18.setBounds(999, 298, 80, 80);

		panel4.add(seatBtn18);

		JButton seatBtn19 = new JButton("19");

		seatBtn19.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		seatBtn19.setBounds(999, 382, 80, 80);

		panel4.add(seatBtn19);

		JButton seatBtn20 = new JButton("20");

		seatBtn20.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		seatBtn20.setBounds(999, 469, 80, 80);

		panel4.add(seatBtn20);

		JButton seatBtn21 = new JButton("21");

		seatBtn21.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		seatBtn21.setBounds(999, 553, 80, 80);

		panel4.add(seatBtn21);

		JButton seatBtn22 = new JButton("22");

		seatBtn22.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		seatBtn22.setBounds(999, 638, 80, 80);

		panel4.add(seatBtn22);

		JButton seatBtn23 = new JButton("23");

		seatBtn23.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		seatBtn23.setBounds(352, 382, 80, 80);

		panel4.add(seatBtn23);

		JButton seatBtn24 = new JButton("24");

		seatBtn24.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		seatBtn24.setBounds(352, 469, 80, 80);

		panel4.add(seatBtn24);

		JButton seatBtn25 = new JButton("25");

		seatBtn25.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		seatBtn25.setBounds(352, 553, 80, 80);

		panel4.add(seatBtn25);

		JButton seatBtn26 = new JButton("26");

		seatBtn26.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		seatBtn26.setBounds(433, 382, 80, 80);

		panel4.add(seatBtn26);

		JButton seatBtn27 = new JButton("27");

		seatBtn27.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		seatBtn27.setBounds(433, 469, 80, 80);

		panel4.add(seatBtn27);

		JButton seatBtn28 = new JButton("28");

		seatBtn28.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		seatBtn28.setBounds(433, 553, 80, 80);

		panel4.add(seatBtn28);

		JButton seatBtn29 = new JButton("29");

		seatBtn29.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		seatBtn29.setBounds(673, 382, 80, 80);

		panel4.add(seatBtn29);

		JButton seatBtn30 = new JButton("30");

		seatBtn30.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		seatBtn30.setBounds(673, 469, 80, 80);

		panel4.add(seatBtn30);

		JButton seatBtn31 = new JButton("31");

		seatBtn31.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		seatBtn31.setBounds(673, 553, 80, 80);

		panel4.add(seatBtn31);

		JButton seatBtn32 = new JButton("32");

		seatBtn32.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		seatBtn32.setBounds(749, 382, 80, 80);

		panel4.add(seatBtn32);

		JButton seatBtn33 = new JButton("33");

		seatBtn33.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		seatBtn33.setBounds(749, 469, 80, 80);

		panel4.add(seatBtn33);

		JButton seatBtn34 = new JButton("34");

		seatBtn34.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		seatBtn34.setBounds(749, 553, 80, 80);

		panel4.add(seatBtn34);

		JLabel lbWelcome = new JLabel("로그인 부탁드립니다!");
		lbWelcome.setFont(new Font("HY견고딕", Font.PLAIN, 30));
		lbWelcome.setBounds(422, 237, 428, 110);
		panel4.add(lbWelcome);

		JLabel lbTime1_1 = new JLabel("New label");
		lbTime1_1.setFont(new Font("HY견고딕", Font.PLAIN, 30));
		lbTime1_1.setBounds(884, -19, 284, 119);
		panel4.add(lbTime1_1);

		JButton btnSignUp_1_1 = new JButton("뒤로");
		btnSignUp_1_1.setForeground(Color.WHITE);
		btnSignUp_1_1.setFont(new Font("HY견고딕", Font.PLAIN, 20));
		btnSignUp_1_1.setBackground(new Color(0, 128, 255));
		btnSignUp_1_1.setBounds(10, 69, 176, 52);
		panel4.add(btnSignUp_1_1);

		btnSignUp_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel4.setVisible(false);
				panel1.setVisible(true);

			}
		});

		// panel5 시간권화면
		JPanel panel5 = new JPanel();

		panel5.setBounds(0, 0, 1184, 811);

		frame.getContentPane().add(panel5);

		panel5.setLayout(null);

		panel5.setVisible(false);

		JLabel lbTime1_3 = new JLabel("New label");
		lbTime1_3.setFont(new Font("HY견고딕", Font.PLAIN, 30));
		lbTime1_3.setBounds(884, -19, 284, 119);
		panel5.add(lbTime1_3);

		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(new Color(0, 128, 255));
		panel_2_1.setBounds(0, 0, 1155, 59);
		panel5.add(panel_2_1);

		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBackground(Color.LIGHT_GRAY);
		panel_1_1_1.setBounds(0, 58, 1155, 31);
		panel5.add(panel_1_1_1);

		JLabel price_1 = new JLabel("시간권");

		price_1.setForeground(new Color(0, 128, 255));

		price_1.setFont(new Font("HY견고딕", Font.PLAIN, 30));

		price_1.setBounds(548, 149, 107, 68);

		panel5.add(price_1);

		JButton priceBtn1 = new JButton("1 시간 2000원");

		priceBtn1.setBackground(new Color(0, 128, 255));

		priceBtn1.setBounds(135, 264, 200, 125);

		priceBtn1.setForeground(new Color(255, 255, 255));

		priceBtn1.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		panel5.add(priceBtn1);

		JButton priceBtn2 = new JButton("2 시간 4000원");

		priceBtn2.setForeground(Color.WHITE);

		priceBtn2.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		priceBtn2.setBackground(new Color(0, 128, 255));

		priceBtn2.setBounds(494, 264, 200, 125);

		panel5.add(priceBtn2);

		JButton priceBtn3 = new JButton("4 시간 7000원");

		priceBtn3.setForeground(Color.WHITE);

		priceBtn3.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		priceBtn3.setBackground(new Color(0, 128, 255));

		priceBtn3.setBounds(838, 264, 200, 125);

		panel5.add(priceBtn3);

		JButton priceBtn4 = new JButton("6 시간 10000원");

		priceBtn4.setForeground(Color.WHITE);

		priceBtn4.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		priceBtn4.setBackground(new Color(0, 128, 255));

		priceBtn4.setBounds(135, 494, 200, 125);

		panel5.add(priceBtn4);

		JButton priceBtn5 = new JButton("8 시간 13000원");

		priceBtn5.setForeground(Color.WHITE);

		priceBtn5.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		priceBtn5.setBackground(new Color(0, 128, 255));

		priceBtn5.setBounds(494, 494, 200, 125);

		panel5.add(priceBtn5);

		JButton priceBtn6 = new JButton("10 시간 15000원");

		priceBtn6.setForeground(Color.WHITE);

		priceBtn6.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		priceBtn6.setBackground(new Color(0, 128, 255));

		priceBtn6.setBounds(838, 494, 200, 125);

		panel5.add(priceBtn6);

		JButton p5_btnBack = new JButton("뒤로");
		p5_btnBack.setForeground(Color.WHITE);
		p5_btnBack.setFont(new Font("HY견고딕", Font.PLAIN, 20));
		p5_btnBack.setBackground(new Color(0, 128, 255));
		p5_btnBack.setBounds(945, 110, 176, 52);
		panel5.add(p5_btnBack);

		p5_btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel5.setVisible(false);
				panel4.setVisible(true);
				dbUpdate2.dUpdate();

				JButton[] seatBtn = { seatBtn1, seatBtn2, seatBtn3, seatBtn4, seatBtn5, seatBtn6, seatBtn7, seatBtn8,
						seatBtn9,

						seatBtn10, seatBtn11, seatBtn12, seatBtn13, seatBtn14, seatBtn15, seatBtn16, seatBtn17,
						seatBtn18,

						seatBtn19, seatBtn20, seatBtn21, seatBtn22, seatBtn23, seatBtn24, seatBtn25, seatBtn26,
						seatBtn27,

						seatBtn28, seatBtn29, seatBtn30, seatBtn31, seatBtn32, seatBtn33, seatBtn34 };
				for (JButton seatBtnn : seatBtn) {
					seatBtnn.setBackground(new Color(0, 128, 255));
					seatBtnn.setForeground(new Color(255, 255, 255));
					seatBtnn.setEnabled(true);
				}
			}
		});

		JPanel panel6 = new JPanel();

		panel6.setBounds(0, 0, 1184, 811);

		frame.getContentPane().add(panel6);

		panel6.setLayout(null);

		panel6.setVisible(false);

		JLabel lbTime1_4 = new JLabel("New label");
		lbTime1_4.setFont(new Font("HY견고딕", Font.PLAIN, 30));
		lbTime1_4.setBounds(884, -19, 284, 119);
		panel6.add(lbTime1_4);

		JTextField idField6 = new JTextField();

		idField6.setBounds(618, 332, 201, 39);

		panel6.add(idField6);

		idField6.setColumns(10);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 128, 255));
		panel_2.setBounds(0, 0, 1155, 59);
		panel6.add(panel_2);

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.LIGHT_GRAY);
		panel_1_1.setBounds(0, 58, 1155, 31);
		panel6.add(panel_1_1);

		JLabel panel6Num = new JLabel("전화번호");

		panel6Num.setForeground(new Color(0, 128, 255));

		panel6Num.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		panel6Num.setBounds(451, 332, 93, 39);

		panel6.add(panel6Num);

		JLabel panel6Pass = new JLabel("비밀번호");

		panel6Pass.setForeground(new Color(0, 128, 255));

		panel6Pass.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		panel6Pass.setBounds(451, 409, 80, 24);

		panel6.add(panel6Pass);

		JLabel IblResult6 = new JLabel("");

		IblResult6.setBounds(765, 21, 0, 0);

		panel6.add(IblResult6);

		JPasswordField PasswordField6 = new JPasswordField();

		PasswordField6.setColumns(10);

		PasswordField6.setBounds(618, 404, 201, 39);

		panel6.add(PasswordField6);

		JButton initial = new JButton("초기화");

		initial.setForeground(new Color(255, 255, 255));

		initial.setBackground(new Color(0, 128, 255));

		initial.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		initial.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				// JoinForm newOne = new JoinForm();

				// newOne.setVisible(true);

			}

		});

		initial.setBounds(666, 507, 100, 48);

		panel6.add(initial);

		JButton outlogin = new JButton("퇴실");

		outlogin.setBackground(new Color(0, 128, 255));

		outlogin.setForeground(new Color(255, 255, 255));

		outlogin.setFont(new Font("HY견고딕", Font.PLAIN, 20));

		outlogin.setBounds(493, 507, 100, 48);

		panel6.add(outlogin);

		JLabel lblNewLabel = new JLabel("퇴실");

		lblNewLabel.setFont(new Font("HY견고딕", Font.PLAIN, 40));

		lblNewLabel.setForeground(new Color(0, 128, 255));

		lblNewLabel.setBounds(597, 174, 181, 87);

		panel6.add(lblNewLabel);

		JButton btnSignUp_1_3 = new JButton("뒤로");
		btnSignUp_1_3.setForeground(Color.WHITE);
		btnSignUp_1_3.setFont(new Font("HY견고딕", Font.PLAIN, 20));
		btnSignUp_1_3.setBackground(new Color(0, 128, 255));
		btnSignUp_1_3.setBounds(910, 125, 176, 52);
		panel6.add(btnSignUp_1_3);

		// 퇴실 이벤트
		outlogin.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				LocalDateTime now = LocalDateTime.now();
				dbUpdate2.endTime((int) now.getHour());
				dbUpdate2.endMinute((int) now.getMinute());
				dbUpdate2.etimeUpdate();
				dbUpdate2.eminuteUpdate();
				System.out.println("남은시간 = " + (dbUpdate2.etime - dbUpdate2.stime) + "시간"
						+ (dbUpdate2.eminute - dbUpdate2.sminute) + "분");
				System.out.println("끝" + dbUpdate2.etime + "시작" + dbUpdate2.stime);
//                                System.out.println(dbUpdate2.);
//				String uid1 = idField6.getText();
				uid1 = idField6.getText();

				String upass2 = "";

				for (int i = 0; i < PasswordField6.getPassword().length; i++) {

					upass2 = upass2 + PasswordField6.getPassword()[i];

				}
				// 질문거리

				if (uid1.equals("") || upass2.equals("")) {

					JOptionPane.showMessageDialog(null, "아이디와 비밀번호를 모두 입력해주세요", "로그인에 실패하셨습니다",

							JOptionPane.ERROR_MESSAGE);

					System.out.println("로그인 실패 > 로그인 정보 미입력");

				}

				else if (uid1 != null && upass2 != null) {

					try {

						if (customer2.logincheck(uid1, upass2) != null) {

							JOptionPane.showMessageDialog(null, "퇴실에 성공하셨습니다.");

							panel3.setVisible(true);

							panel6.setVisible(false);
							dbUpdate2.setNum(uid1);
							dbUpdate2.SelectSeat();
							int index = dbUpdate2.SelectSeat() - 1;

							dbUpdate2.setNum(uid1);
							dbUpdate2.dUpdate();
							idField6.setText("");

							PasswordField6.setText("");

							JButton[] seatBtn = { seatBtn1, seatBtn2, seatBtn3, seatBtn4, seatBtn5, seatBtn6, seatBtn7,
									seatBtn8, seatBtn9,

									seatBtn10, seatBtn11, seatBtn12, seatBtn13, seatBtn14, seatBtn15, seatBtn16,
									seatBtn17, seatBtn18,

									seatBtn19, seatBtn20, seatBtn21, seatBtn22, seatBtn23, seatBtn24, seatBtn25,
									seatBtn26, seatBtn27,

									seatBtn28, seatBtn29, seatBtn30, seatBtn31, seatBtn32, seatBtn33, seatBtn34 };

							System.out.println(seatBtn[index].getText());
							seatBtn[index].setBackground(new Color(0, 128, 255));
							seatBtn[index].setForeground(new Color(255, 255, 255));
							seatBtn[index].setEnabled(true);
							lbWelcome.setText("로그인 부탁드립니다!");

						} else {

							System.out.println("로그인 실패 > 정보 불일치");

							JOptionPane.showMessageDialog(null, "로그인에 실패했습니다");

						}

					} catch (HeadlessException e1) {

						e1.printStackTrace();

					} catch (SQLException e1) {

						e1.printStackTrace();

					}

				}

			}

		});

		btnSignUp_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel6.setVisible(false);
				panel3.setVisible(true);

			}
		});

		frame.setVisible(true);

//panel6 퇴실화면
		map = new HashMap<String, String>();

		map.put("01011111111", "1234");

//panel7 결제화면
		JPanel panel7 = new JPanel();

		panel7.setBounds(0, 0, 1184, 811);

		frame.getContentPane().add(panel7);

		panel7.setVisible(false);

		panel7.setLayout(null);

		JLabel payselect = new JLabel("결제 수단을 선택해 주세요");
		payselect.setFont(new Font("HY견고딕", Font.PLAIN, 24));
		payselect.setBounds(482, 165, 297, 75);

		JLabel textfield7 = new JLabel();
		textfield7.setFont(new Font("HY견고딕", Font.PLAIN, 24));
		textfield7.setBounds(375, 620, 603, 125);
		panel7.setLayout(null);

		JLabel lbTime1_5 = new JLabel("New label");
		lbTime1_5.setFont(new Font("HY견고딕", Font.PLAIN, 30));
		lbTime1_5.setBounds(884, -19, 284, 119);
		panel7.add(lbTime1_5);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 128, 255));
		panel_3.setBounds(0, 0, 1155, 59);
		panel7.add(panel_3);

		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(Color.LIGHT_GRAY);
		panel_1_2.setBounds(0, 58, 1155, 31);
		panel7.add(panel_1_2);

		panel7.add(payselect);

		panel7.add(textfield7);

		JButton paykakao = new JButton("카카오 페이");
		paykakao.setFont(new Font("HY견고딕", Font.PLAIN, 20));
		paykakao.setForeground(new Color(255, 255, 255));
		paykakao.setBackground(new Color(0, 128, 255));
		paykakao.setBounds(810, 332, 183, 114);
		panel7.add(paykakao);

		JButton paycard = new JButton("카드 결제");
		paycard.setFont(new Font("HY견고딕", Font.PLAIN, 20));
		paycard.setBackground(new Color(0, 128, 255));
		paycard.setForeground(new Color(255, 255, 255));
		paycard.setBounds(518, 332, 183, 114);
		panel7.add(paycard);

		JButton paymoney = new JButton("현금 결제");
		paymoney.setFont(new Font("HY견고딕", Font.PLAIN, 20));
		paymoney.setBackground(new Color(0, 128, 255));
		paymoney.setForeground(new Color(255, 255, 255));
		paymoney.setBounds(239, 332, 183, 114);
		panel7.add(paymoney);

		JPanel panel8 = new JPanel();
		panel8.setBounds(0, 0, 1184, 811);
		frame.getContentPane().add(panel8);
		panel8.setLayout(null);
		panel8.setVisible(false);

		JLabel lbTime1_6 = new JLabel("New label");
		lbTime1_6.setFont(new Font("HY견고딕", Font.PLAIN, 30));
		lbTime1_6.setBounds(884, -19, 284, 119);
		panel8.add(lbTime1_6);

		JButton BtnOne = new JButton("처음으로");
		BtnOne.setFont(new Font("HY견고딕", Font.PLAIN, 30));
		BtnOne.setBackground(new Color(0, 128, 255));
		BtnOne.setForeground(new Color(255, 255, 255));
		BtnOne.setBounds(470, 624, 230, 120);
		panel8.add(BtnOne);

		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(
				"C:\\Users\\admin\\Desktop\\temporary\\choongang\\swingproject2\\src\\studypro\\중앙스터디카페2.png"));
		lblNewLabel_2.setBounds(396, 92, 350, 210);
		panel8.add(lblNewLabel_2);

		JLabel nameLabel = new JLabel("New label");
		nameLabel.setBounds(169, 316, 764, 52);
		panel8.add(nameLabel);

		JLabel starttimeLabel = new JLabel("New label");
		starttimeLabel.setBounds(169, 412, 764, 52);
		panel8.add(starttimeLabel);

		JLabel endtimeLabel = new JLabel("New label");
		endtimeLabel.setBounds(169, 508, 766, 52);
		panel8.add(endtimeLabel);
		BtnOne.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				panel8.setVisible(false);

				panel3.setVisible(true);

			}

		});

		JPanel panel9 = new JPanel();
		panel9.setBounds(0, 0, 1184, 811);
		frame.getContentPane().add(panel9);

		JPanel panel10 = new JPanel();
		panel10.setBounds(0, 0, 1184, 811);
		frame.getContentPane().add(panel10);

		JPanel panel11 = new JPanel();
		panel11.setBounds(0, 0, 1184, 811);
		frame.getContentPane().add(panel11);

		paymoney.addActionListener(new ActionListener() {

			@Override

			public void actionPerformed(ActionEvent e) {

				textfield7.setText("지폐 투입구에 현금을 투입해주세요.");

			}

		});

		paycard.addActionListener(new ActionListener() {

			@Override

			public void actionPerformed(ActionEvent e) {

				textfield7.setText("결제 완료 문구가 뜰 때 까지 카드를 뽑지 마세요.");

			}

		});

		paykakao.addActionListener(new ActionListener() {

			@Override

			public void actionPerformed(ActionEvent e) {

				textfield7.setText("결제 바코드를 스캐너에 갖다 대주세요.");

			}

		});

		// 좌석선택 이벤트
		JButton[] seatBtn = { seatBtn1, seatBtn2, seatBtn3, seatBtn4, seatBtn5, seatBtn6, seatBtn7, seatBtn8, seatBtn9,

				seatBtn10, seatBtn11, seatBtn12, seatBtn13, seatBtn14, seatBtn15, seatBtn16, seatBtn17, seatBtn18,

				seatBtn19, seatBtn20, seatBtn21, seatBtn22, seatBtn23, seatBtn24, seatBtn25, seatBtn26, seatBtn27,

				seatBtn28, seatBtn29, seatBtn30, seatBtn31, seatBtn32, seatBtn33, seatBtn34 };

		for (JButton seatBtnn : seatBtn) {
			seatBtnn.setBackground(new Color(0, 128, 255));
			seatBtnn.setForeground(new Color(255, 255, 255));

			seatBtnn.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {

					int answer = JOptionPane.showConfirmDialog(null, "이 좌석을 선택하시겠습니까?", "확인창", YES_NO_OPTION);

					if (answer == JOptionPane.YES_OPTION) {

						System.out.println("-----------");

						System.out.println("-----------");

						panel4.setVisible(false);

						panel5.setVisible(true);

//						seatBtnn.setBackground(Color.red);
//
//						seatBtnn.setEnabled(false); // 버튼 비활성화

						dbUpdate2.setSeatNum(Integer.parseInt(seatBtnn.getText()));
						dbUpdate2.sUpdate();

					} else if (answer == JOptionPane.NO_OPTION) {

						panel4.setVisible(true);

						panel5.setVisible(false);

					}

				}

			});

		}

//                priceBtn2.addActionListener(new ActionListener() {
//
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//                                int answer = JOptionPane.showConfirmDialog(null, "결제하시겠습니까?", "확인창", YES_NO_OPTION);
//
//                                if (answer == JOptionPane.YES_OPTION) {
//
//                                        System.out.println("-----------");
//
//                                        System.out.println("-----------");
//
//                                        panel5.setVisible(false);
//
//                                        panel7.setVisible(true);
//                                        
//                                        dbUpdate2.twoTime(2);
//
//                                } else if (answer == JOptionPane.NO_OPTION) {
//
//                                        panel5.setVisible(true);
//
//                                        panel7.setVisible(false);
//
//                                }
//
//                        }
//                        
//                });

		paymoney.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				int answer = JOptionPane.showConfirmDialog(null, "현금으로 결제하시겠습니까?", "확인창", YES_NO_OPTION);

				if (answer == JOptionPane.YES_OPTION) {

					System.out.println("-----------");

					System.out.println("-----------");

					dbUpdate2.setNum(uid1);
					int index = dbUpdate2.SelectSeat() - 1;
					System.out.println(uid1);
					System.out.println(index);
					JButton[] seatBtn = { seatBtn1, seatBtn2, seatBtn3, seatBtn4, seatBtn5, seatBtn6, seatBtn7,
							seatBtn8, seatBtn9,

							seatBtn10, seatBtn11, seatBtn12, seatBtn13, seatBtn14, seatBtn15, seatBtn16, seatBtn17,
							seatBtn18,

							seatBtn19, seatBtn20, seatBtn21, seatBtn22, seatBtn23, seatBtn24, seatBtn25, seatBtn26,
							seatBtn27,

							seatBtn28, seatBtn29, seatBtn30, seatBtn31, seatBtn32, seatBtn33, seatBtn34 };

					seatBtn[index].setBackground(Color.red);

					seatBtn[index].setEnabled(false); //

					LocalDateTime now = LocalDateTime.now();
					dbUpdate2.setTime((int) now.getHour());
					dbUpdate2.setMinute((int) now.getMinute());
					dbUpdate2.stimeUpdate();
					dbUpdate2.sminuteUpdate();

					panel7.setVisible(false);

					panel8.setVisible(true);

				} else if (answer == JOptionPane.NO_OPTION) {

					panel7.setVisible(true);

					panel8.setVisible(false);

				}

			}

		});
		paycard.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				int answer = JOptionPane.showConfirmDialog(null, "카드로 결제하시겠습니까?", "확인창", YES_NO_OPTION);

				if (answer == JOptionPane.YES_OPTION) {

					System.out.println("-----------");

					System.out.println("-----------");

					dbUpdate2.setNum(uid1);
					int index = dbUpdate2.SelectSeat() - 1;
					System.out.println(uid1);
					System.out.println(index);
					JButton[] seatBtn = { seatBtn1, seatBtn2, seatBtn3, seatBtn4, seatBtn5, seatBtn6, seatBtn7,
							seatBtn8, seatBtn9,

							seatBtn10, seatBtn11, seatBtn12, seatBtn13, seatBtn14, seatBtn15, seatBtn16, seatBtn17,
							seatBtn18,

							seatBtn19, seatBtn20, seatBtn21, seatBtn22, seatBtn23, seatBtn24, seatBtn25, seatBtn26,
							seatBtn27,

							seatBtn28, seatBtn29, seatBtn30, seatBtn31, seatBtn32, seatBtn33, seatBtn34 };

					seatBtn[index].setBackground(Color.red);

					seatBtn[index].setEnabled(false); //

					LocalDateTime now = LocalDateTime.now();
					dbUpdate2.setTime((int) now.getHour());
					dbUpdate2.setMinute((int) now.getMinute());
					dbUpdate2.stimeUpdate();
					dbUpdate2.sminuteUpdate();

					panel7.setVisible(false);

					panel8.setVisible(true);

				} else if (answer == JOptionPane.NO_OPTION) {

					panel7.setVisible(true);

					panel8.setVisible(false);

				}

			}

		});
		paykakao.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				int answer = JOptionPane.showConfirmDialog(null, "카카오페이로 결제하시겠습니까?", "확인창", YES_NO_OPTION);

				if (answer == JOptionPane.YES_OPTION) {

					System.out.println("-----------");

					System.out.println("-----------");

					dbUpdate2.setNum(uid1);
					int index = dbUpdate2.SelectSeat() - 1;
					System.out.println(uid1);
					System.out.println(index);
					JButton[] seatBtn = { seatBtn1, seatBtn2, seatBtn3, seatBtn4, seatBtn5, seatBtn6, seatBtn7,
							seatBtn8, seatBtn9,

							seatBtn10, seatBtn11, seatBtn12, seatBtn13, seatBtn14, seatBtn15, seatBtn16, seatBtn17,
							seatBtn18,

							seatBtn19, seatBtn20, seatBtn21, seatBtn22, seatBtn23, seatBtn24, seatBtn25, seatBtn26,
							seatBtn27,

							seatBtn28, seatBtn29, seatBtn30, seatBtn31, seatBtn32, seatBtn33, seatBtn34 };

					seatBtn[index].setBackground(Color.red);

					seatBtn[index].setEnabled(false); //

					LocalDateTime now = LocalDateTime.now();
					dbUpdate2.setTime((int) now.getHour());
					dbUpdate2.setMinute((int) now.getMinute());
					dbUpdate2.stimeUpdate();
					dbUpdate2.sminuteUpdate();
					panel7.setVisible(false);

					panel8.setVisible(true);

				} else if (answer == JOptionPane.NO_OPTION) {

					panel7.setVisible(true);

					panel8.setVisible(false);

				}

			}

		});

		// ---시간 코드 시작------------------
		Thread th2 = new Thread() {

			public void run() {

				while (true) {

					LocalDateTime now = LocalDateTime.now();

					lbTime.setText(now.getHour() + " 시 " + now.getMinute() + " 분 " + now.getSecond() + " 초 ");
					lbTime1.setText(now.getHour() + " 시 " + now.getMinute() + " 분 " + now.getSecond() + " 초 ");
					lbTime1_1.setText(now.getHour() + " 시 " + now.getMinute() + " 분 " + now.getSecond() + " 초 ");
					lbTime1_2.setText(now.getHour() + " 시 " + now.getMinute() + " 분 " + now.getSecond() + " 초 ");
					lbTime1_3.setText(now.getHour() + " 시 " + now.getMinute() + " 분 " + now.getSecond() + " 초 ");
					lbTime1_4.setText(now.getHour() + " 시 " + now.getMinute() + " 분 " + now.getSecond() + " 초 ");
					lbTime1_5.setText(now.getHour() + " 시 " + now.getMinute() + " 분 " + now.getSecond() + " 초 ");
					lbTime1_6.setText(now.getHour() + " 시 " + now.getMinute() + " 분 " + now.getSecond() + " 초 ");

				}
			}
		};

		th2.start();

		// 입실버튼 이벤트
		p3_btnEnt.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				panel1.setVisible(true);

				panel3.setVisible(false);

			}

		});

		// 퇴실버튼 이벤트
		p3_btnLeave.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				panel3.setVisible(false);

				panel6.setVisible(true);

			}

		});
		p3_btnCurSeat.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panel4.setVisible(true);
				panel3.setVisible(false);
			}

		});

		// 입실버튼 이벤트
		p3_btnEnt.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				panel1.setVisible(true);

				panel3.setVisible(false);

			}

		});

		// 퇴실버튼 이벤트
		p3_btnLeave.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				panel3.setVisible(false);

				panel6.setVisible(true);

			}

		});
		p3_btnCurSeat.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panel4.setVisible(true);
				panel3.setVisible(false);
			}

		});

		// ------------------이벤트 처리--------------------------------------------

		// 초기화버튼 이벤트
		btnReset.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				textField.setText("");

				passwordField.setText("");

			}

		});

		// 회원가입버튼 이벤트
		btnSignUp.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				panel1.setVisible(false);

				panel2.setVisible(true);

			}

		});

		// 로그인버튼 이벤트
		btnLogin.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				String uid = textField.getText();

				String upass = "";

				for (int i = 0; i < passwordField.getPassword().length; i++) {

					upass = upass + passwordField.getPassword()[i];

				} // 질문거리

				if (uid.equals("") || upass.equals("")) {

					JOptionPane.showMessageDialog(null, "아이디와 비밀번호를 모두 입력해주세요", "로그인 실패",

							JOptionPane.ERROR_MESSAGE);

					System.out.println("로그인 실패 > 로그인 정보 미입력");

				}

				else if (uid != null && upass != null) {

					try {

						if (customer2.logincheck(uid, upass) != null) {
							uid1 = uid;

							System.out.println("로그인 성공");

							JOptionPane.showMessageDialog(null, "로그인에 성공했습니다");

							panel4.setVisible(true);

							panel1.setVisible(false);

							lbWelcome.setText(customer2.logincheck(uid, upass) + "님 환영합니다!");

							dbUpdate2.setNum(uid);
							textField.setText("");

							passwordField.setText("");
						} else {

							System.out.println("로그인 실패 > 정보 불일치");

							JOptionPane.showMessageDialog(null, "로그인에 실패했습니다");

						}

					} catch (HeadlessException e1) {

						e1.printStackTrace();

					} catch (SQLException e1) {

						e1.printStackTrace();

					}

				}

			}

		});

		// 금액선택 이벤트
		int[] pricenum = { 1, 2, 4, 6, 8, 10 };
		JButton[] priceBtn = { priceBtn1, priceBtn2, priceBtn3, priceBtn4, priceBtn5, priceBtn6 };

		for (JButton priceBtnn : priceBtn) {

			priceBtnn.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {

					int answer = JOptionPane.showConfirmDialog(null, "결제하시겠습니까?", "확인창", YES_NO_OPTION);

					if (answer == JOptionPane.YES_OPTION) {

						System.out.println("-----------");

						System.out.println("-----------");

						panel5.setVisible(false);

						panel7.setVisible(true);

						int index2 = Arrays.asList(priceBtn).indexOf(priceBtnn);
						System.out.println(pricenum[index2]);
						dbUpdate2.paytime(pricenum[index2]);
						dbUpdate2.paytimeUpdate();
						dbUpdate2.outtimeUpdate();
					} else if (answer == JOptionPane.NO_OPTION) {

						panel5.setVisible(true);

						panel7.setVisible(false);

					}

				}

			});

		}

		btnSignUp_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel1.setVisible(false);
				panel3.setVisible(true);

			}
		});
		// ---시간 코드 끝-----------------------

	}
}
//---------------이벤트처리 끝-------------------------------------------------
