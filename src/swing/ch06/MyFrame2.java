package swing.ch06;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame2 extends JFrame implements Runnable{

    private JLabel backgroundMap;
    private JLabel player;
    private JLabel enemy;


    // 플레이어 이미지 L, R
    ImageIcon playerIconL = new ImageIcon("images/playerL.png");
    ImageIcon playerIconR = new ImageIcon("images/playerR.png");
    ImageIcon enemyIConL = new ImageIcon("images/enemyL.png");
    ImageIcon enemyIConR = new ImageIcon("images/enemyR.png");

    // 이동 설정 값
    private final int MOVE_STEP = 10; // 플레이어 이동 픽셀

    // 적 이동 방향 (1: 오른쪽, -1: 왼쪽)
    private int enemyDirection = 1;
    // 적 이동 속도
    private final int ENEMY_SPEED = 5;

    public MyFrame2() {
        initData();
        setInitLayout();
        addEventListener();

        Thread thread = new Thread(this);
        thread.start();
    }

    private void initData() {
        setTitle("이미지 겹치기 연습");
        setSize(1000, 640);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 배경 이미지 설정해보기
        ImageIcon backgroundIcon = new ImageIcon("images/backgroundMap.png");
        backgroundMap = new JLabel(backgroundIcon);
        // 배치 관리자 좌표 ==> 컴포넌트 사이즈와 위치를 직접 지정해야 한다.
        backgroundMap.setSize(1000, 600);
        backgroundMap.setLocation(0, 0);

        // 플레이어 이미지 초기화
        player = new JLabel(playerIconL);
        player.setSize(100, 100);
        player.setLocation(200, 510);

        // 적 이미지 초기화
        enemy = new JLabel(enemyIConR);
        enemy.setSize(100,100);
        enemy.setLocation(400,510);

    }

    private void setInitLayout() {
        // 루트 패널에 설정
        setLayout(null);
        add(backgroundMap);

        backgroundMap.add(player);
        backgroundMap.add(enemy);
        setVisible(true);
    }

    private void addEventListener() {
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                int x = player.getX();
                int y = player.getY();

                // 플레이어가 이동 가능한 최대 좌표
                int maxX = backgroundMap.getWidth() - player.getWidth() - MOVE_STEP ;
                int maxY = backgroundMap.getHeight() - player.getHeight() + MOVE_STEP;

                // 플레이어가 이동 가능한 최소 좌표
                int minX = player.getWidth()/2;
                int minY = 0;

                // 제어문 -- switch
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_UP :
                        y -= MOVE_STEP;
                        break;
                    case KeyEvent.VK_LEFT :
                        player.setIcon(playerIconL);
                        x -= MOVE_STEP;
                        break;
                    case KeyEvent.VK_RIGHT:
                        player.setIcon(playerIconR);
                        x += MOVE_STEP;
                        break;
                    case KeyEvent.VK_DOWN:
                        y += MOVE_STEP;
                        break;
                    default:
                        return;
                }

                // 경계 제한
                if (x < minX) x = minX;
                if (y < minY) y = minY;
                if (x > maxX) x = maxX;
                if (y > maxY) y = maxY;

                // 화살표 이벤트를 받아서 다시 플레이어의 좌표갑 지정
                player.setLocation(x,y);

            }


            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }

    @Override
    public void run() {
        while (true) {

            int x = enemy.getX();

            // 이동
            x += ENEMY_SPEED * enemyDirection;

            // 에너미가 이동 가능한 최대 좌표
            int maxX = backgroundMap.getWidth() - player.getWidth() - MOVE_STEP ;
            int maxY = backgroundMap.getHeight() - player.getHeight() + MOVE_STEP;

            // 에너미가 이동 가능한 최소 좌표
            int minX = player.getWidth()/2;
            int minY = 0;

            // 오른쪽 끝에서 왼쪽으로 다시 돌아가기
            if (x >= maxX) {
                x = maxX;
                enemyDirection = -1;
                enemy.setIcon(enemyIConL);
            }

            // 왼쪽 끝에서 오른쪽으로 다시 돌아가기
            if (x <= minX) {
                x = minX;
                enemyDirection = 1;
                enemy.setIcon(enemyIConR);
            }

            enemy.setLocation(x, enemy.getY());

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    // 테스트 코드

    public static void main(String[] args) {
        new MyFrame2();
    }
}
