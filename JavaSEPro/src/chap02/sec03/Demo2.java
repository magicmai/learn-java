package chap02.sec03;

public class Demo2 {
	
	public static void main(String args[]) {
		// ����һ��float���ͱ���f
		// С��Ĭ����double���ͣ��������Ǳ������һ��f������ʾfloat����
		float f = 1.1f;
		System.out.println("f = " + f);
		
		// ����һ��double���ͱ���d
		double d = 1.2;
		System.out.println("d = " + d);
		
		// ���float�����ֵ
		float maxf = Float.MAX_VALUE;
		System.out.println("maxf = " + maxf);
		
		// ���double�����ֵ����Сֵ
		double maxd = Double.MAX_VALUE;
		double mind = Double.MIN_VALUE;
		System.out.println("maxd = " + maxd);
		System.out.println("mind = " + mind);
	}
}
