package swing.ch03;

import swing.MyImageFrame;

import javax.swing.*;
import java.awt.*;

// 중첩 클래스 활용
public class SwingFrame extends JFrame {

    // JPanel 를 상속한 클래스라 기능을 다 물려 받았다.
    SwingFrame.HousePanel swingPanel;

    public SwingFrame() {
        setTitle("중첩클래스활용");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        swingPanel = new SwingFrame.HousePanel();
        add(swingPanel);
        setVisible(true);
    }

    // 2. 정적 내부 클래스 선언
    static class HousePanel extends JPanel {

        private Image tree;

        public HousePanel() {
            tree = new ImageIcon("C:\\PJH\\work_space\\java_class_1\\java_v1\\src\\tree.jpg").getImage();
        }

        @Override
        public void paint(Graphics g) {
            super.paint(g);
            // 집 본체
            g.setColor(new Color(139,69,19));
            g.drawRect(100, 150, 200, 150);
            // 지붕 (삼각형)
            int[] xPoints = {90, 200, 310};
            int[] yPoints = {150, 50, 150};
            g.fillPolygon(xPoints, yPoints, 3);
            // 문
            g.fillRect(180, 220, 40, 80);
            // 창문
            g.setColor(Color.LIGHT_GRAY);
            g.fillRect(120, 180, 40, 40);
            g.fillRect(240, 180, 40, 40);
            // 창문 테두리
            g.setColor(Color.CYAN);
            g.drawLine(140, 180, 140, 220);
            g.drawLine(120, 200, 160, 200);
            g.drawLine(260, 180, 260, 220);
            g.drawLine(240, 200, 280, 200);

            g.drawImage(tree,350, 50 , 200, 250, null);
        }
    } // end of inner class


    // 테스트 코드 작성
    public static void main(String[] args) {
        new SwingFrame();
    }
}