package chap12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Frame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel7 = new JPanel();
        JLabel payselect = new JLabel("결제 수단을 선택해 주세요");
        JButton paymoney = new JButton("현금 결제");
        JButton paycard = new JButton("카드 결제");
        JButton paykakao = new JButton("카카오 페이");

        JTextField textfield7 = new JTextField(100);
        JPanel paybutton = new JPanel();
        panel7.setLayout(new BorderLayout());

        paybutton.add(paymoney);
        paybutton.add(paycard);
        paybutton.add(paykakao);
        panel7.add(payselect, BorderLayout.NORTH);
        panel7.add(paybutton, BorderLayout.WEST);
        panel7.add(textfield7,BorderLayout.CENTER);

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
    }
}
