package chap02.sec03;

public class Demo3 {

	public static void main(String[] args) {
		// 定义一个单个字符
		char c1 = 'A';
		System.out.println("c1 = " + c1);
		
		// 定义一个反斜杠字符
		char c2 = '\\';
		System.out.println("c2 = " + c2);
		
		// 用Unicode编码输出名字
		char c4 = '\u738b';
		char c5 = '\u4e00';
		System.out.println("c4 = " + c4);
		System.out.println("c5 = " + c5);
	}
}
