package chap12;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class OutLogin extends JFrame {

    private JPanel contentPane;
    private JTextField idField6;
    private JPasswordField PasswordField6;
    private JLabel IblResult6;
    private Map<String, String> map;
    private JButton inital;
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
       
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    OutLogin frame = new OutLogin();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public OutLogin() {
        map= new HashMap<String,String>();
        map.put("01011111111", "1234");
//        map.put("01022222222", "1111");
//        map.put("01033333333", "2222");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200,850);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
         
           
           JPanel panel6= new JPanel();
           panel6.setBounds(0, 0, 1184, 811);
           contentPane.add(panel6);
           panel6.setLayout(null);
          
           idField6 = new JTextField();
           idField6.setBounds(519, 155, 116, 21);
           panel6.add(idField6);
           idField6.setColumns(10);
         
          inital.setBounds(519, 307, 100, 48);
          panel6.add(inital);
        
         JButton outlogin = new JButton("퇴실");
         outlogin.setFont(new Font("HY견고딕", Font.PLAIN, 20));
         outlogin.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 String result;
                 String id = idField6.getText();
                 String pass = String.valueOf(PasswordField6.getPassword());
                 if(map.containsKey(id)&&pass.equals(map.get(id))){
                     result="퇴실 처리되었습니다.";
                     IblResult6.setForeground(Color.green);
                 } else {
                     result="전화번호 또는 비밀번호가 잘못 됨.";
                     IblResult6.setForeground(Color.blue);
                 }
                 System.out.println(map.containsKey(id));
                 System.out.println(map.get(id));
                 System.out.println(pass);
                
                 IblResult6.setText(result);
             }
         });
         outlogin.setBounds(389, 307, 100, 48);
         panel6.add(outlogin);
       
        JLabel panel6Num = new JLabel("전화번호");
        panel6Num.setFont(new Font("HY견고딕", Font.PLAIN, 20));
        panel6Num.setBounds(396, 144, 93, 39);
        panel6.add(panel6Num);
       
        JLabel panel6Pass = new JLabel("비밀번호");
        panel6Pass.setFont(new Font("HY견고딕", Font.PLAIN, 20));
        panel6Pass.setBounds(396, 209, 80, 24);
        panel6.add(panel6Pass);
       
        IblResult6 = new JLabel("");
        IblResult6.setBounds(765, 21, 0, 0);
        panel6.add(IblResult6);
       
        PasswordField6 = new JPasswordField();
        PasswordField6.setColumns(10);
        PasswordField6.setBounds(519, 213, 116, 21);
        panel6.add(PasswordField6);
        
        inital = new JButton("초기화");
        inital.setFont(new Font("HY견고딕", Font.PLAIN, 20));
        inital.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//               JoinForm newOne = new JoinForm();
//               newOne.setVisible(true);
            }
        });
    }
}
