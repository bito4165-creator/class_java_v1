package useful.ch12;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Step7 {
    public static void main(String[] args) {
        //1부터 1억까지 더하는 로직이 실제로 몇 밀리초 걸리는지 측정하는 프로그램입니다
        // (시작 시간 / 종료 시간)
        long sum = 0;

        LocalTime start1 = LocalTime.now();
        Instant start = Instant.now();

        for (int i = 1; i <= 100_000_000; i++) {
            sum += i;
        }

        LocalTime end1 = LocalTime.now();
        Instant end = Instant.now();

        Duration result = Duration.between(start, end);
        long usedMilliTime = ChronoUnit.MILLIS.between(start, end);

        System.out.println("합계 : " + sum);
        System.out.println("걸린시간 : " + result.toMillis() + "ms");
        System.out.println("걸린 시간 : " + usedMilliTime + "ms" );


    }
}