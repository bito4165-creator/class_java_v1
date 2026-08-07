package swing.ch01;

import javax.swing.*;
import java.awt.*;

public class MyBoarderFrame extends JFrame {
    // 1.배열과 for문 활용
    private JButton[] buttons= new JButton[5];
    private BorderLayout borderLayout;
    private String[] setTable = {
            BorderLayout.NORTH,
            BorderLayout.SOUTH,
            BorderLayout.CENTER,
            BorderLayout.WEST,
            BorderLayout.EAST
    };


    public MyBoarderFrame() {
        setTitle("boarderLayout 연습");
        setSize(600,400);
        setVisible(true);
        // x 누르면 동시에 프로그램도 종료 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initDate();
        setInitLayout();
    }

    public void initDate() {
        // 2.배열과 for문 활용
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("버튼"+(i+1));
        }

        borderLayout = new BorderLayout();
    }

    public void setInitLayout() {
        // 배치 관리자 선정을 하고 Frame 설정해 보자.
        setLayout(borderLayout); // Frame에 배치관리자 설정
        // 보더 레이아웃은 add할때 동 서 남 북 가운데 를 명시해주어야 한다.
        // 3. 배열과 for문 활용\

        for (int i = 0; i < buttons.length; i++) {
            add(buttons[i], setTable[i]);
        }
    }



}
