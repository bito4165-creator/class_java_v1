package startcraft.ver_2;

import java.util.Scanner;

public class GameTest {
    public static void main(String[] args) {
        int unit;
        int select;
        Zealot zealot = new Zealot("질럿");
        Zergling zergling = new Zergling("저글링");
        Marine marine = new Marine("마린");

        Scanner sc = new Scanner(System.in);
        System.out.println("유닛을 선택해주세요.");
        System.out.println("1. 질럿 2. 저글링 3. 마린");
        unit = sc.nextInt();
        sc.nextLine();
        if (unit == 1) {
            while (true) {
                System.out.println("질럿의 행동을 선택해주세요");
                System.out.println("1. 저글링 공격 2. 마린 공격 3. 저글링에게 공격당함 4.마린에게 공격당함 5.상태확인");
                select = sc.nextInt();
                sc.nextLine();
                if (select == 1) {
                    zealot.attack(zergling);
                } else if (select == 2) {
                    zealot.attack(marine);
                } else if (select == 3) {
                    zealot.beAttacked(zergling.getPower());
                } else if (select == 4) {
                    zealot.beAttacked(marine.getPower());
                } else if (select == 5) {
                    zealot.showInfo();
                } else if (select > 5 || select < 1) {
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                }
            }
        } else if (unit ==2) {
            while (true) {
                System.out.println("마린의 행동을 선택해주세요");
                System.out.println("1. 질럿 공격 2. 저글링 공격 3. 질럿에게 공격당함 4.저글링에게 공격당함 5.상태확인");
                select = sc.nextInt();
                sc.nextLine();
                if (select == 1) {
                    marine.attack(zealot);
                } else if (select == 2) {
                    marine.attack(zergling);
                } else if (select == 3) {
                    marine.beAttacked(zealot.getPower());
                } else if (select == 4) {
                    marine.beAttacked(zergling.getPower());
                } else if (select == 5) {
                    marine.showInfo();
                } else if (select > 5 || select < 1) {
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                }
            }
        } else if (unit == 3) {
            while (true) {
                System.out.println("저글링의 행동을 선택해주세요");
                System.out.println("1. 질럿 공격 2. 마린 공격 3. 질럿에게 공격당함 4.마린에게 공격당함 5.상태확인");
                select = sc.nextInt();
                sc.nextLine();
                if (select == 1) {
                    zealot.attack(zergling);
                } else if (select == 2) {
                    zergling.attack(marine);
                } else if (select == 3) {
                    zergling.beAttacked(zealot.getPower());
                } else if (select == 4) {
                    zergling.beAttacked(marine.getPower());
                } else if (select == 5) {
                    zergling.showInfo();
                } else if (select > 5 || select < 1) {
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                }
            }
        } else if (unit > 3 || unit < 1) {
            System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
        }



    }




}
