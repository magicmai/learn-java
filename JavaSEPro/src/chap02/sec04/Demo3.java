package chap02.sec04;

public class Demo3 {

	public static void main(String[] args) {
		int a = 1;
		// a++：先赋值后自增
		int b = a++;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		int c = 1;
		// ++c：先自增再赋值
		int d = ++c;
		System.out.println("c="+c);
		System.out.println("d="+d);
		
		
	}
}
