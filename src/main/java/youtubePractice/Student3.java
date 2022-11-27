package youtubePractice;

public class Student3 extends Person3{ //Person3 を継承
private int stuNo;

public Student3(String name) { //コンストラクタ　名前だけを受け取る
	this(name,9999);
}
public Student3(String name, int stuNo) { //コンストラクタ　名前と学籍番号を受け取る
	super(name);
	this.stuNo = stuNo;
}
public void display() {
	super.display();
	System.out.println("学籍番号：" + stuNo);
}
}
