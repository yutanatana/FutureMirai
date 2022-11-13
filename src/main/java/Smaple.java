
public class Smaple {
//教科書5-3練習問題
	public static void main (String[] args) {
	 String address = "futureMirai@pornhub.com";
	 String text = "今度一緒に遊びませんか";
	 email(address,text);
	}
	public static void email (String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：無題");
		System.out.println("本文" + text);
	}
	public static void email (String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}
}
