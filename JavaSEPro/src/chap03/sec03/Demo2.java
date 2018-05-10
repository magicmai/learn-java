package chap03.sec03;

public class Demo2 {

	void fun1() {
		System.out.println("调用了普通方法：对象.方法");
	}
	
	static void fun2() {
		System.out.println("调用了静态方法：类名.方法");
	}
	
	public static void main(String[] args) {
		Demo2 demo2 = new Demo2();
		// 调用普通方法
		demo2.fun1();
		
		// 调用静态方法1：类名.方法（常用）
		Demo2.fun2();
		
		// 调用静态方法2：对象.方法
		// demo2.fun2();
	}
}
