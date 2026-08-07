package ch08;

public class ContinueTest3 {

    public static void main(String[] args) {
        // 369 게임! 1부터 30까지 세되
        // 3, 6, 9 들어간 숫자는 "짝" 이라고 외칩니다.
        // 13, 16, 19
        // 23, 26, 29

        // 샘플 테스트 코드
        // 나머지 연산자와 10이라는 숫자를 활용하면 끝 자리를 추출할 수 있다.
        for (int i = 1; i <= 30; i++) {
            // i값의 끝자리를 구하는 식을 작성하고 변수 in last에 담아주세요
            int last = i % 10;
            boolean countThree = (last % 3 == 0);
            boolean countTen = (i/10 == 3) || (i/10 == 6) || (i/10 == 9);
            if (last == 0) {
                if (countTen) {
                    System.out.print("짝!");
                    continue;
                }
                System.out.print(i +" ");
            }
            if (last != 0) {
                if (countThree) {
                    System.out.print("짝! ");
                    continue;
                }
                System.out.print(i +" ");

            }
            // 1, 2,  ,4 ,5, ,7 ... 369를 제외하고 화면에 출력 되어야한다.
        }
        System.out.println();
        System.out.println("--------------------------------");

        for (int i = 1; i <= 30; i++) {
            // i값에 끝자리를 구하는 식을 작성하고 변수int last에 담아주세요
            // 만약 끝자리가 3,6,9라면 화면에 짝!이라고 출력하시오.
            //숫자 1, 2, , 4, 5, , 7,...369 를 제외하고 화면에 출력되어야 합니다.
            int last = i % 10;
            if (last == 3 || last == 6 || last == 9) {
                System.out.println("짝!");
                continue;
            }
            if (i == 30) {
                continue;
            }
            System.out.println(i);
        }

    } // end of main
} // end of class
