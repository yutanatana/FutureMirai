package Thief;

public class Main {
public static void heal(int hp) {
	hp += 10;
}
public static void heal (Theif thief) {
	thief.hp += 10;
}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int baseHp = 25;
		Theif t = new Theif("朝霞", baseHp);
		heal(baseHp);
		System.out.println(baseHp + ":" + t.hp);
		heal(t);
		System.out.println(baseHp + ":" + t.hp);
	}

}
