package startcraft.ver_5;

public class Unit implements Attacker, Damageable{

    protected String name;
    protected int power;
    protected int hp;

    // getter
    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getHp() {
        return hp;
    }


    @Override
    public void attack(Damageable target) {
        if (this.hp <= 0) {
            System.out.println(name + "이(가) 사망하여 공격할 수 없습니다.");
            return;
        }
        System.out.println(name + "이(가) 상대를 공격합니다.");
        target.beAttacked(this.power);
    }

    @Override
    public void beAttacked(int power) {
        this.hp = Math.max(0, this.hp - power);
        System.out.println(name + "이(가) 공격을 당합니다. (남은 HP : " + this.hp + ")");
    }

    // 상태창
    public void showInfo() {
        System.out.println("★----------상태창--------------★");
        System.out.println("유닛 이름 : " + name + " | 공격력 : " + power + " | 체력 : " + hp);
    }

}

