package useful.exceptionStudy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Study4 { // BufferedReader / FileReader 개념 이해하기
    //문제 4. 파일 열기 예외 처리
    //
    //사용자로부터 파일 이름을 입력받아 파일의 내용을 출력하는 프로그램을 작성하세요.
    //
    //조건
    //파일이 존재하지 않으면 "파일을 찾을 수 없습니다."를 출력하세요.
    //파일이 존재하면 내용을 출력하세요.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("파일 이름을 입력하세요: ");
        String fileName = scanner.nextLine();

        // try-with-resources 문을 사용하여 자동으로 자원 해제
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            // 파일의 내용을 한 줄씩 읽어서 출력
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            // 파일이 존재하지 않는 경우
            System.out.println("파일을 찾을 수 없습니다.");
        } catch (IOException e) {
            // 파일을 읽는 과정에서 다른 입출력 오류가 발생한 경우
            System.out.println("파일을 읽는 중 오류가 발생했습니다.");
        } finally {
            scanner.close();
        }
    }



}
