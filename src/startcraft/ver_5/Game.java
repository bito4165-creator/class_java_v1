package startcraft.ver_5;

public class Game {
    public static void main(String[] args) {
        Unit unit1 = new Marine("마린");
        Unit unit2 = new Zealot("질럿");
        Unit unit3 = new Zergling("저글링");

        unit1.attack(unit2);
        unit2.attack(unit3);
        unit3.attack(unit1);
    }
}
