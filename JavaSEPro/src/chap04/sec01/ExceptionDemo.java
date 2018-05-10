package chap04.sec01;

public class ExceptionDemo {

	public static void main(String[] args) {
		String s = "123q";
		int s1 = Integer.parseInt(s);  // 异常，在此中断执行
		System.out.println(s1);        // 不执行
	}
}
