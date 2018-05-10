package chap02.sec04;

public class Demo4 {

	public static void main(String[] args) {
		// && 与：遇到false就返回false，不再检查后面的
		boolean b1 = (5>6) && (5>4);
		System.out.println("b1=" + b1);
		
		// & 不短路与，即使前面有错误操作数也要检查后面的全部
		boolean b2 = (5<3) & (5>4);
		System.out.println("b2=" + b2);
		
		// 一般都用 && 短路与
		// 原因：效率高
		
		// || 或，遇到true就返回true
		boolean b3 = (2>3) || (3<4);
		System.out.println("b3="+b3);
		
		// | 不短路或
		boolean b4 = (2>3) | (3<4);
		System.out.println("b4="+b4);
		
		// ! 非
		boolean b5 = !(2>5);
		System.out.println("b5="+b5);
		
		// ^ 异或，当两个操作数不相同时，返回true
		boolean b6 = (5>4)^(4>5);
		System.out.println("b6="+b6);
	}
}
