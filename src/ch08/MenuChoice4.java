package ch08;

// 수입하다 ,가지고 오다.
import java.util.Scanner;

public class MenuChoice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 스캐너 활용 - 문자열로 값 받기(키보드에서)
        int menuNum = sc.nextInt();
        // nextInt 는 정수값 가지고 가고 개행문자는 남겨 둔다.
        // 남겨진 \n을 소비해 주면 된다.
        sc.nextLine(); // 개행 문자 소비
        String name = sc.nextLine(); // 문자열 받기
        System.out.println("menuNum : " + menuNum);
        System.out.println("name : " + name);

    } // end of main

} // end of class
