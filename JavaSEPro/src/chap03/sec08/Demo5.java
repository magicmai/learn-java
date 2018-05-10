package chap03.sec08;

public class Demo5 {

	public static void main(String[] args) {
		String name = "张三";
		char san = name.charAt(1);
		System.out.println(san);
		
		String str = "我是中国人";
		// 遍历字符串
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i));
		}
	}
}
