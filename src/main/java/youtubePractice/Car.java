package youtubePractice;

public class Car {

	//メンバ変数 　データ型　変数名
	int no;
	int speed;
	
	//メソッド　　戻り値の型　メソッド名　引数　
	void setNo(int n) { // void型→戻り値無し
		no = n;
	}
	void run(int s) {
		speed = s;
	}
	void stop() {
		speed = 0;
	}
	void display() {
		System.out.println("ナンバー" + no + "の速度は" + speed + "です");
	}
}
