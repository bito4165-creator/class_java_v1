package useful.ch03;

public class StringTest2 {

    public static void main(String[] args) {

        String str1 = new String("Hello");
        String str2 = new String("World");
        System.out.println(str1); // 원래는 참조변수를 대입하면 --> 주소값

        // String 실제 주소값을 확인해보자
        System.out.println(System.identityHashCode(str1)); // 해쉬코드갑 확인 가능

        // 문자열 불변이다. (한번 생성된 문자열은 불변이고 변경이 발생되면 새로 문자열이 생성되는 구조다)
        // 한번 생성된 문자열을 불변이고 다시 바꿔쓰는것이다.
        // str1 = str1 + "world";
        str1 = str1.concat("world");
        System.out.println("str1+world : " + str1);
        System.out.println(System.identityHashCode(str1));

    }

}


