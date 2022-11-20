package youtubePractice;
//文字列を数値に変換する
public class practice1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String age = "31";
		int n = Integer.parseInt(age); //文字列を数値に変換
		System.out.println("あなたは今年" + (n+1) + "歳になりますね。");
		
		int r = new java.util.Random().nextInt(100);//ランダムに数値を出力
		System.out.println(r);
		
		System.out.println("please enter your name!");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("please enter your age");
		int year = new java.util.Scanner(System.in).nextInt();
		
		System.out.println("welcome " + name + "," + year + "s old");
		
		
		
		
	}

}
