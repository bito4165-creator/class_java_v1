package useful.ch17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Challenge1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//        List<Integer> twolist = numbers.stream()
//                .filter(n -> n % 2 == 0)
//                .map(n -> n * n)
//                .toList();
//
//        System.out.println(twolist.toString());

        // 도전과제 1 - Stream API를 사용하지 않고 만들어보기
        // 짝수만 골라서 어딘가 담아야 한다면 -> List 생성
        // 짝수만 받아서 그 수를 제곱 어디간 담아야 한다면 -> List 생성

        // 1.결과를 담을 빈 리스트를 만든다. 동시에 (하나만 생성)
        List<Integer> twolist = new ArrayList<>();
        System.out.println(twolist.isEmpty());

        // 2. 하나씩 꺼내서 처리
        for(int n : numbers) {
            // 3. 조건을 검사한다 만약 짝수라면 (filter)
            if (n % 2 == 0) {
                // 4. 값을 변경한다 (map)
                int square = n * n;
                // 5. 값을 담아준다 (toList)
                twolist.add(square);
            }
        }
        System.out.println("for 문 : " + twolist);


    }
}

