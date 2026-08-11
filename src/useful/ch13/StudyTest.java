package useful.ch13;

import java.util.ArrayList;

public class StudyTest {
    public static void main(String[] args) {
        // 배열 버전
        String[] users = new String[100];
        int count = 0;
        users[count++] = "철수";
        users[count++] = "영희";
        users[count++] = "민준";

        // ArrayList 버전으로 작성하세요.
        ArrayList<String> users1 = new ArrayList<>();

        users1.add("철수");
        users1.add("영희");
        users1.add("민준");




    }


}

