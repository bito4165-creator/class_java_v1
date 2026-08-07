package useful.ch12;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class OldWay {

    public static void main(String[] args) {

        // Date - JDK 1 버전에 만들어진 클래스
        // 1. 현재 시간 출력
        Date now = new Date();
        System.out.println("현재 시각 : " + now);
        // 일단 출력 형식부터 문제임 . 영어 요일과 월 이름이 섞여 있어서 사용자 화면에 그대로 쓸 수 없음.

        // 2. Date로 특정 날짜 만들기
        Date date = new Date(2025, 4, 12);
        System.out.println("설정한 날짜 : " + date);
        // 3925 년도로 결과가 확인 됨.
        // Date의 연도는 1900을 기준으로 세기 때문에 그래서 2025년을 만들려고하면 125를 넣어야 한다.

        Date date2 = new Date(125, 4, 12); // 2025 년 5월 12일
        // Date month는 0 ~ 시작함
        // 위와 같은 문제점 있는 부분 때문에 JDK 1.1 부터 곧바로 Calendar 클래스를 만들어 줬다.

        System.out.println("-------------------------");

        // Date 타입의 대안 1.1에서
        Calendar cal = Calendar.getInstance(); // new Calendar() <--- 싱글톤 패턴 구현 되어 있어 메서드로 호출 해야 함.
        cal.set(2025,4, 12); // 2025 5 12 설정함.
        System.out.println(cal.getTime());

        // 위 문제들을 해결하기 위해서 8 버전 부터 java.time 패키지를 제공함.

        LocalDate localDate = LocalDate.of(2025, 5, 12); // 5월 그냥 5이다.
        System.out.println("설정한 날짜 3 : " + localDate);

    }

}
