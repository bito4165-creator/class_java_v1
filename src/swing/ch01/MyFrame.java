package swing.ch01;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    private JButton[] Buttons = new JButton[3];

    // 문제1. JButton 객체를 JButton 객체에 넣어보자
    // 문제2. 배열을 활용해서 코드를 수정해주세요.

    public MyFrame() {
        super.setTitle("배치 관리자 연습");
        super.setSize(600, 300);
        super.setVisible(true);

        initData();
        setInitLayout();
    }

    public void initData() {
        for (int i = 0 ; i <Buttons.length; i++) {
            Buttons[i] = new JButton("버튼"+(i+1));
        }

    }

    public void setInitLayout() {
        // 배치 관리자 선언
        FlowLayout flowLayout = new FlowLayout();
        //컴포넌트들을 수정, 수직으로 프레임 배티해 주는 녀석이다.
        super.setLayout(flowLayout);
        for (int i = 0; i < Buttons.length; i++) {
            super.add(Buttons[i]);
        }
    }



    // 테스트 코드
    public static void main(String[] args) {
        MyFrame frame1 = new MyFrame(); // 생성자 호출 -> 생성자에 있는 로직이 동작 한다.

    } // end dof main

} // end of class
