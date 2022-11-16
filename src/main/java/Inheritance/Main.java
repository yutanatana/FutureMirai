package Inheritance;

public class Main {
public static void main(String[] args) {
	Hero h = new Hero();
	Matango m = new Matango();
	
	
	h.run();
	h.attack(m);
	h.attack(m);
	h.attack(m);
	h.attack(m);
	SuperHero sh = new SuperHero();
	
	sh.run();
	sh.fly();
	

}
}
