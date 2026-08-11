package useful.ch15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordBook {
    public static void main(String[] args) {
        // apple, -> 사과
        Map<String, String> words = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        words.put("apple", "사과");
        words.put("banana", "바나나");
        words.put("cherry", "체리");

        while (true) {
            System.out.println("\n===== 영한 단어장 ========");
            System.out.println("1. 단어 추가 2. 단어 검색 3. 전체 출력 4. 종료");
            System.out.println("선택 : ");
            String choice = sc.nextLine();

            // 아래 기능을 구현해주세요
            if (choice.equals("1")) {
                System.out.println("추가할 단어를 입력해주세요");
                System.out.println("영어 > ");
                String newWord = sc.nextLine();
                System.out.println("한글 > ");
                String newWord2 = sc.nextLine();

                words.put(newWord, newWord2);
                System.out.println("단어가 추가되었습니다.");
            }

            if (choice.equals("2")) {
                String searchWord = sc.nextLine();
                if (words.containsKey(searchWord)) {
                    System.out.println(searchWord + " : " + words.get(searchWord));
                } else if (words.containsValue(searchWord)) {
                    for (Map.Entry<String, String> entry : words.entrySet()) {
                        if (entry.getValue().equals(searchWord)) {
                            System.out.println( entry.getKey() + " : " + entry.getValue() );
                            break;
                        }
                    }
                } else {
                    System.out.println("단어가 없습니다.");
                }
            }

            if (choice.equals("3")) {
                System.out.println(words);
            }

            if (choice.equals("4")) {
                break;
            }

        }


        // 자원 닫기
        // sc.close();
    }
}

