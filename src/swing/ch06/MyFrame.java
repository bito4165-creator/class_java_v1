package swing.ch06;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.EventListener;

public class MyFrame extends JFrame {

    private JLabel backgroundMap;
    private JLabel player;
    private ImageIcon playerLeftIcon = new ImageIcon("images/playerL.png");
    private ImageIcon playerRightIcon = new ImageIcon("images/playerR.png");
    private final int MOVE_FLOW = 10;
    private final int UP_DOWN = 60;

    public MyFrame() {
        initDate();
        setInitLayout();
        addEventListener();
    }

    private void initDate() {
        setSize(1000,640);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 배경 이미지 설정해보기
        //
        ImageIcon backgroundIcon = new ImageIcon("images/backgroundMap.png");
        backgroundMap = new JLabel(backgroundIcon);
        // 배치 관리자 좌표 ==> 컴포넌트 사이즈와 위치 직접 지정해야 한다.

        backgroundMap.setSize(1000,610);
        backgroundMap.setLocation(0,0);

        // 플레이어 이미지 초기화
        player = new JLabel(playerLeftIcon);
        player.setSize(100,100);
        player.setLocation(200,510);

    }

    private void setInitLayout() {
        // 루트 패널에 설정
        setLayout(null);
        add(backgroundMap);
        backgroundMap.add(player);
        setVisible(true);
    }
    private void addEventListener() {
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                int x = player.getX();
                int y = player.getY();

                // 플레이어가 이동 가능한 최대 좌표
                int maxX = backgroundMap.getWidth() - player.getWidth();
                int maxY = backgroundMap.getHeight() - player.getHeight();

                if (keyCode == KeyEvent.VK_UP) {
                    y -= UP_DOWN;
                } else if (keyCode == KeyEvent.VK_DOWN) {
                    y += UP_DOWN;
                } else if (keyCode == KeyEvent.VK_LEFT) {
                    player.setIcon(playerLeftIcon);
                    x -= MOVE_FLOW;
                } else if (keyCode == KeyEvent.VK_RIGHT) {
                    player.setIcon(playerRightIcon);
                    x += MOVE_FLOW;
                }

                // 경계 제한
                if (x < 0) x = 0;
                if (y < 0) y = 0;
                if (x > maxX) x = maxX;
                if (y > maxY) y = maxY;

                player.setLocation(x, y);
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        new MyFrame();
    }

}
