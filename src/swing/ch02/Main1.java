package swing.ch02;

import javax.swing.*;

public class Main1 {
    public static void main(String[] args) {
        MyComponent myComponent = new MyComponent();
        myComponent.run();

        // 문제 1
        // 힌트 - 메인함수에서 텍스트 필드에 접근해서 객체안에 문자열 값을 코드로 주입해보자.
        JTextField filed1 = myComponent.getTextField();
        filed1.setText("홍길동");

    }


}
