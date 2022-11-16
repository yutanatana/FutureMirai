package Inheritance;

public class Hero {
String name = "金丸";
int hp = 100;

//battle
public void attack(Matango m) {
	System.out.println(this.name + "の攻撃！");
	m.hp -= 5;
	System.out.println("5ポイントのダメージを与えた！");
}
//逃げる
public void run() {
	System.out.println(this.name + "は逃げ出した");
}
}
