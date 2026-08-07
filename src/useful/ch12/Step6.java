package useful.ch12;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Step6 {


    public static void main(String[] args) {
        //1. 생일이 무슨 요일이었는지 (한글로)
        //2. 기준 날짜 시점의 만 나이
        //3. 태어난 지 총 며칠이 지났는지 (ChronoUnit)
        //4. 기준 날짜부터 크리스마스까지 D-day (ChronoUnit)
        //5. 기준 시각을 "2025년 05월 13일 오후 02시 30분" 형식으로 출력

        // 생일 요일: 금요일
        //만 나이: 25세
        //살아온 날: 9132일
        //크리스마스까지: 226일
        //현재: 2025년 05월 13일 오후 02시 30분

        LocalDate birth = LocalDate.of(2000,5,5);
        LocalDate now = LocalDate.of(2025,5,13);
        LocalDateTime nowT = LocalDateTime.of(2025,5,13,2,30);

        // 1. 생일이 무슨 요일이었는지 (한글로)

        String birthday = birth.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN);

        //2. 기준 날짜 시점의 만 나이
        int age = Period.between(birth,now).getYears();

        //3. 태어난 지 총 며칠이 지났는지 (ChronoUnit)
        long livedDays = ChronoUnit.DAYS.between(birth,now);

        //4. 기준 날짜부터 크리스마스까지 D-day (ChronoUnit)
        LocalDate christmas = LocalDate.of(now.getYear(),12,25);
        long dday = ChronoUnit.DAYS.between(now,christmas);

        //5. 기준 시각을 "2025년 05월 13일 오후 02시 30분" 형식으로 출력
        DateTimeFormatter recode = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 a hh시 mm분", Locale.KOREAN);

        System.out.println("생일 요일 : " + birthday);
        System.out.println("만 나이 : " + age);
        System.out.println("살아온 날 : " + livedDays);
        System.out.println("크리스마스까지 : " + dday);
        System.out.println("현재 : " + nowT.format(recode));



    }
}
