package blb;

public class Practice1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
double triangleArea = calTriangleArea(10.0,5.0);
System.out.println("三角形の面積：" + triangleArea + "平方㎝");
	}
	public static double calTriangleArea(double bottom, double height) {
		double area = (bottom*height)/2;
		return area;
	}
public static double calTraiangleArea(double radius) {
	double area = radius*radius*3.14;
	return area;
}
}
