package Inheritance;

public class Hero {                   //クラスにfinalがついていたら継承禁止、
String name = "金丸";
int hp = 100;

//battle
public void attack(Matango m) {
System.out.println(this.name + "が" + m.name + "にダイレクトアタック！");
	m.hp -= 99;
	System.out.println("5ポイントのダメージを与えた！");
	System.out.println(m.name +"残りHP" + m.hp);
	}
//逃げる
public void run() {
	System.out.println(this.name + "は逃げ出した");
}
}
