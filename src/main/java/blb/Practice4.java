package blb;

import java.util.HashMap;
import java.util.Map;

public class Practice4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Map<Integer, String> map = new HashMap<>();
        map.put(5, "日本");
        map.put(1, "アメリカ");
        map.put(4, "中国");
        map.put(2, "オーストラリア");
        map.put(3, "スウェーデン");
	

	for (int i = １; i < map.size(); i++) { //i = 0 から始めるとnullがでる
		System.out.println(i + "番目の国は" + map.get(i) + "です");
	}
}
}