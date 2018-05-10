package chap02.sec03;

public class Demo2 {
	
	public static void main(String args[]) {
		// 定义一个float类型变量f
		// 小数默认是double类型，所以我们必须添加一个f，来表示float类型
		float f = 1.1f;
		System.out.println("f = " + f);
		
		// 定义一个double类型变量d
		double d = 1.2;
		System.out.println("d = " + d);
		
		// 输出float的最大值
		float maxf = Float.MAX_VALUE;
		System.out.println("maxf = " + maxf);
		
		// 输出double的最大值，最小值
		double maxd = Double.MAX_VALUE;
		double mind = Double.MIN_VALUE;
		System.out.println("maxd = " + maxd);
		System.out.println("mind = " + mind);
	}
}
