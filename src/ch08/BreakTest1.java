package ch08;

public class BreakTest1 {
    public static void main(String[] args) {

        // 중간에 멈추는 break 구문

        // 만약 1값이 7이라면 중간에 멈추어라
        for(int i = 0; i < 10; i++) {
            System.out.println("i : " + i);
//            if (i == 7) {
//                break;
//            }
        }

        System.out.println("------------------------");
        // 문제  1. 100 ~ 200 까지 화면에 출력하는 코드를 작성하시오
        //      2. 단 151도달 했다면 반복문을 멈추는 코드를 작성하시오
        //      단 while 구문을 사용해서 코드를 작성해주세요
        int start = 100;
        int end = 200;
        int flagNum = 151;
        while (start <= end) {
            System.out.println("start : " + start);
            start++;
            if (start == flagNum+1) {
                break;
            }
        }



    } // end of main

} // end of class
