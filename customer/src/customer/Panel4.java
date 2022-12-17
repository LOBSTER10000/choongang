package customer;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Panel4 extends Wlogin {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel4 window = new Panel4();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Panel4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		JPanel panel4 = new JPanel();
		panel4.setBounds(0, 0, 1184, 811);
		frame.getContentPane().add(panel4);
		panel4.setLayout(null);
		panel4.setVisible(true);
		
		JButton btnNewButton_4_1_8 = new JButton("7번");
		btnNewButton_4_1_8.setFont(new Font("HY견고딕", Font.PLAIN, 20));
		btnNewButton_4_1_8.setBounds(191, 124, 80, 80);
		panel4.add(btnNewButton_4_1_8);
		
		JButton btnNewButton_4_1_8_1 = new JButton("8번");
		btnNewButton_4_1_8_1.setFont(new Font("HY견고딕", Font.PLAIN, 20));
		btnNewButton_4_1_8_1.setBounds(272, 124, 80, 80);
		panel4.add(btnNewButton_4_1_8_1);
		
		JButton btnNewButton_4_1_8_2 = new JButton("9번");
		btnNewButton_4_1_8_2.setFont(new Font("HY견고딕", Font.PLAIN, 20));
		btnNewButton_4_1_8_2.setBounds(352, 124, 80, 80);
		panel4.add(btnNewButton_4_1_8_2);
		
		JButton btnNewButton_4_1_8_3 = new JButton("10번");
		btnNewButton_4_1_8_3.setFont(new Font("HY견고딕", Font.PLAIN, 20));
		btnNewButton_4_1_8_3.setBounds(433, 124, 80, 80);
		panel4.add(btnNewButton_4_1_8_3);
		
		JButton btnNewButton_4_1_8_4 = new JButton("11번");
		btnNewButton_4_1_8_4.setFont(new Font("HY견고딕", Font.PLAIN, 20));
		btnNewButton_4_1_8_4.setBounds(514, 124, 80, 80);
		panel4.add(btnNewButton_4_1_8_4);
		
		JButton btnNewButton_4_1_8_5 = new JButton("12번");
		btnNewButton_4_1_8_5.setFont(new Font("HY견고딕", Font.PLAIN, 20));
		btnNewButton_4_1_8_5.setBounds(594, 124, 80, 80);
		panel4.add(btnNewButton_4_1_8_5);
		
		JButton btnNewButton_4_1_8_6 = new JButton("13번");
		btnNewButton_4_1_8_6.setFont(new Font("HY견고딕", Font.PLAIN, 20));
		btnNewButton_4_1_8_6.setBounds(673, 124, 80, 80);
		panel4.add(btnNewButton_4_1_8_6);
		
		JButton btnNewButton_4_1_8_7 = new JButton("14번");
		btnNewButton_4_1_8_7.setFont(new Font("HY견고딕", Font.PLAIN, 20));
		btnNewButton_4_1_8_7.setBounds(749, 124, 80, 80);
		panel4.add(btnNewButton_4_1_8_7);
		
		JButton btnNewButton_4_1_8_8 = new JButton("15번");
		btnNewButton_4_1_8_8.setFont(new Font("HY견고딕", Font.PLAIN, 20));
		btnNewButton_4_1_8_8.setBounds(830, 124, 80, 80);
		panel4.add(btnNewButton_4_1_8_8);
		
		JButton btnNewButton_4_1_8_9 = new JButton("16번");
		btnNewButton_4_1_8_9.setFont(new Font("HY견고딕", Font.PLAIN, 20));
		btnNewButton_4_1_8_9.setBounds(912, 124, 80, 80);
		panel4.add(btnNewButton_4_1_8_9);
		
		JButton btnNewButton_4_1_8_10 = new JButton("6번");
		btnNewButton_4_1_8_10.setFont(new Font("HY견고딕", Font.PLAIN, 20));
		btnNewButton_4_1_8_10.setFont(new Font("HY견고딕", Font.PLAIN, 20));
		btnNewButton_4_1_8_10.setBounds(110, 214, 80, 80);
		panel4.add(btnNewButton_4_1_8_10);
		
		JButton btnNewButton_4_1_8_11 = new JButton("5번");
		btnNewButton_4_1_8_11.setFont(new Font("HY견고딕", Font.PLAIN, 20));
		btnNewButton_4_1_8_11.setFont(new Font("HY견고딕", Font.PLAIN, 20));
		btnNewButton_4_1_8_11.setBounds(110, 298, 80, 80);
		panel4.add(btnNewButton_4_1_8_11);
		
		JButton btnNewButton_4_1_8_12 = new JButton("4번");
		btnNewButton_4_1_8_12.setFont(new Font("HY견고딕", Font.PLAIN, 20));
		btnNewButton_4_1_8_12.setBounds(110, 382, 80, 80);
		panel4.add(btnNewButton_4_1_8_12);
		
		JButton btnNewButton_4_1_8_13 = new JButton("3번");
		btnNewButton_4_1_8_13.setFont(new Font("HY견고딕", Font.PLAIN, 20));
		btnNewButton_4_1_8_13.setBounds(110, 469, 80, 80);
		panel4.add(btnNewButton_4_1_8_13);
		
		JButton btnNewButton_4_1_8_14 = new JButton("2번");
		btnNewButton_4_1_8_14.setFont(new Font("HY견고딕", Font.PLAIN, 20));
		btnNewButton_4_1_8_14.setBounds(110, 553, 80, 80);
		panel4.add(btnNewButton_4_1_8_14);
		
		JButton btnNewButton_4_1_8_15 = new JButton("1번");
		btnNewButton_4_1_8_15.setFont(new Font("HY견고딕", Font.PLAIN, 20));
		btnNewButton_4_1_8_15.setBounds(110, 638, 80, 80);
		panel4.add(btnNewButton_4_1_8_15);
		
		JButton btnNewButton_4_1_8_16 = new JButton("23번");
		btnNewButton_4_1_8_16.setFont(new Font("HY견고딕", Font.PLAIN, 20));
		btnNewButton_4_1_8_16.setBounds(352, 382, 80, 80);
		panel4.add(btnNewButton_4_1_8_16);
		
		JButton btnNewButton_4_1_8_17 = new JButton("26번");
		btnNewButton_4_1_8_17.setFont(new Font("HY견고딕", Font.PLAIN, 20));
		btnNewButton_4_1_8_17.setBounds(433, 382, 80, 80);
		panel4.add(btnNewButton_4_1_8_17);
		
		JButton btnNewButton_4_1_8_18 = new JButton("24번");
		btnNewButton_4_1_8_18.setFont(new Font("HY견고딕", Font.PLAIN, 20));
		btnNewButton_4_1_8_18.setBounds(352, 469, 80, 80);
		panel4.add(btnNewButton_4_1_8_18);
		
		JButton btnNewButton_4_1_8_19 = new JButton("27번");
		btnNewButton_4_1_8_19.setFont(new Font("HY견고딕", Font.PLAIN, 20));
		btnNewButton_4_1_8_19.setBounds(433, 469, 80, 80);
		panel4.add(btnNewButton_4_1_8_19);
		
		JButton btnNewButton_4_1_8_20 = new JButton("25번");
		btnNewButton_4_1_8_20.setFont(new Font("HY견고딕", Font.PLAIN, 20));
		btnNewButton_4_1_8_20.setBounds(352, 553, 80, 80);
		panel4.add(btnNewButton_4_1_8_20);
		
		JButton btnNewButton_4_1_8_21 = new JButton("28번");
		btnNewButton_4_1_8_21.setFont(new Font("HY견고딕", Font.PLAIN, 20));
		btnNewButton_4_1_8_21.setBounds(433, 553, 80, 80);
		panel4.add(btnNewButton_4_1_8_21);
		
		JButton btnNewButton_4_1_8_22 = new JButton("29번");
		btnNewButton_4_1_8_22.setFont(new Font("HY견고딕", Font.PLAIN, 20));
		btnNewButton_4_1_8_22.setBounds(673, 382, 80, 80);
		panel4.add(btnNewButton_4_1_8_22);
		
		JButton btnNewButton_4_1_8_23 = new JButton("32번");
		btnNewButton_4_1_8_23.setFont(new Font("HY견고딕", Font.PLAIN, 20));
		btnNewButton_4_1_8_23.setBounds(749, 382, 80, 80);
		panel4.add(btnNewButton_4_1_8_23);
		
		JButton btnNewButton_4_1_8_24 = new JButton("30번");
		btnNewButton_4_1_8_24.setFont(new Font("HY견고딕", Font.PLAIN, 20));
		btnNewButton_4_1_8_24.setBounds(673, 469, 80, 80);
		panel4.add(btnNewButton_4_1_8_24);
		
		JButton btnNewButton_4_1_8_25 = new JButton("33번");
		btnNewButton_4_1_8_25.setFont(new Font("HY견고딕", Font.PLAIN, 20));
		btnNewButton_4_1_8_25.setBounds(749, 469, 80, 80);
		panel4.add(btnNewButton_4_1_8_25);
		
		JButton btnNewButton_4_1_8_26 = new JButton("31번");
		btnNewButton_4_1_8_26.setFont(new Font("HY견고딕", Font.PLAIN, 20));
		btnNewButton_4_1_8_26.setBounds(673, 553, 80, 80);
		panel4.add(btnNewButton_4_1_8_26);
		
		JButton btnNewButton_4_1_8_27 = new JButton("34번");
		btnNewButton_4_1_8_27.setFont(new Font("HY견고딕", Font.PLAIN, 20));
		btnNewButton_4_1_8_27.setBounds(749, 553, 80, 80);
		panel4.add(btnNewButton_4_1_8_27);
		
		JButton btnNewButton_4_1_8_28 = new JButton("17번");
		btnNewButton_4_1_8_28.setFont(new Font("HY견고딕", Font.PLAIN, 20));
		btnNewButton_4_1_8_28.setBounds(999, 214, 80, 80);
		panel4.add(btnNewButton_4_1_8_28);
		
		JButton btnNewButton_4_1_8_29 = new JButton("18번");
		btnNewButton_4_1_8_29.setFont(new Font("HY견고딕", Font.PLAIN, 20));
		btnNewButton_4_1_8_29.setBounds(999, 298, 80, 80);
		panel4.add(btnNewButton_4_1_8_29);
		
		JButton btnNewButton_4_1_8_30 = new JButton("19번");
		btnNewButton_4_1_8_30.setFont(new Font("HY견고딕", Font.PLAIN, 20));
		btnNewButton_4_1_8_30.setBounds(999, 382, 80, 80);
		panel4.add(btnNewButton_4_1_8_30);
		
		JButton btnNewButton_4_1_8_31 = new JButton("20번");
		btnNewButton_4_1_8_31.setFont(new Font("HY견고딕", Font.PLAIN, 20));
		btnNewButton_4_1_8_31.setBounds(999, 469, 80, 80);
		panel4.add(btnNewButton_4_1_8_31);
		
		JButton btnNewButton_4_1_8_32 = new JButton("21번");
		btnNewButton_4_1_8_32.setFont(new Font("HY견고딕", Font.PLAIN, 20));
		btnNewButton_4_1_8_32.setBounds(999, 553, 80, 80);
		panel4.add(btnNewButton_4_1_8_32);
		
		JButton btnNewButton_4_1_8_33 = new JButton("22번");
		btnNewButton_4_1_8_33.setFont(new Font("HY견고딕", Font.PLAIN, 20));
		btnNewButton_4_1_8_33.setBounds(999, 638, 80, 80);
		panel4.add(btnNewButton_4_1_8_33);
		
	}
}
