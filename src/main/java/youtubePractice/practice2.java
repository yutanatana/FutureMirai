package youtubePractice;
//サンプルプログラム
public class practice2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int price = Integer.parseInt("1980");//数値として解釈させたい文字列
		double rate = 0.08; //消費税8％
		int amount;
		
		amount = (int)(price*(1 + rate));//文字列をint型にキャスト
		System.out.println("税込み金額" + amount + "円");
	}

}
