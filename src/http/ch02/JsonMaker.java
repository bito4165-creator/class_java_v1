package http.ch02;

import java.util.ArrayList;
import java.util.List;

public class JsonMaker {

    public static void main(String[] args) {
        String name = "홍길동";
        int age = 21;
        List<String> subjects = new ArrayList<>();
        subjects.add("수학");
        subjects.add("물리");
        subjects.add("지구과학");


        // 위 데이터를 메서들 호출해서 json 형식에 문자열로 변환하는 기능을 구현
        String result = toJson(name,age,subjects);
        System.out.println(result);


    }

    // 학생 정보를 JSON에 문자열로 조립하는 기능(메서드)
    public static String toJson(String name, int age, List<String> subjects) {
        StringBuilder sb =new StringBuilder();
        sb.append("{\n");
        sb.append("\"name\" : \"").append(name).append("\",\n");
        sb.append("\"age\" : ").append(age).append(",\n");
        sb.append("\"subjects\" : [\n");
//        sb.append("\"").append(subjects.get(0)).append("\"").append(",\n");
//        sb.append("\"").append(subjects.get(1)).append("\"").append(",\n");
//        sb.append("\"").append(subjects.get(2)).append("\"").append("\n");
        for (int i = 0; i<subjects.size(); i++) {
            sb.append("      \"").append(subjects.get(i)).append("\"");
            // 마지막 항목 뒤에는 쉼표를 붙이지 않습니다
            // 후행 쉼표는 JSON 문법 오류입니다
            if (i < subjects.size() -1) {
                sb.append(",");
            }
            sb.append("\n");
        }
        sb.append("  ]\n");
        sb.append("}\n");


        return sb.toString();
    }
}
/*
실행 결과:
{
  "name": "홍길동",
  "age": 21,
  "subjects": [
    "수학",
    "물리",
    "컴퓨터 과학"
  ]
}
*/