package swing.ch04;

import com.oop18.Computer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChangeFrame extends JFrame implements ActionListener {

    private JButton button1;
    private JButton button2;
    private JPanel panel;

    public ColorChangeFrame() {
        initData();
        setInitLayout();
        addEventListener();
    }

    private void initData() {
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button1 = new JButton("button1");
        button2 = new JButton("button2");
        panel = new JPanel();
    }

    private void setInitLayout() {
        setLayout(new BorderLayout());
        panel.setBackground(Color.YELLOW);
        panel.add(button1);
        panel.add(button2);

        add(panel);
        setVisible(true);
    }

    private void addEventListener() {
        // button1 객체에 이벤트 리스너 등록 --> 약속 ---> actionPerformed() 메서드가 콜백 됨
        button1.addActionListener(this);
        button2.addActionListener(this);
    }

    // ActionListener 의 추상 메서드를 구현 메서드로 재정의
    // 미리 약속되어 있는 메서드 즉, 어떤 이벤트가 발생하면
    // 이 해당 메서드 동작 되도록 설계되어 있음. (콜백 메서드)
    @Override
    public void actionPerformed(ActionEvent e) {
        // System.out.println(e.getSource());
        //JButton selectedButton = (JButton) e.getSource();
        Object source = e.getSource();
        // 눌러지면 색깔 바뀌는거 / 버튼1 버튼2 구분에서 작동하게 만들기.
        if (source == button1) {
            panel.setBackground(Color.BLACK);
        } else if (source == button2) {
            panel.setBackground(Color.BLUE);
        }
    }

    public static void main(String[] args) {
        new ColorChangeFrame();

        // 메서드를 일반적으로 호출 a.abd() <----
        // 어떤 이벤트가 발생하면 콜백 불러져서 동작함 <---- 콜백 메서드
    }
}
