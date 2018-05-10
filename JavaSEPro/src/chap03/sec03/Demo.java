package chap03.sec03;

public class Demo {

	int add(int a, int b) {
		System.out.println("方法一");
		return a+b;
	}
	
	/**
	 * 方法的重载，【参数个数】不一样
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	int add(int a, int b, int c) {
		System.out.println("方法二");
		return a+b+c;
	}
	
	/**
	 * 方法的重载，【参数的类型】不一样
	 * @param a
	 * @param b
	 * @return
	 */
	int add(int a, String b) {
		System.out.println("方法三");
		return a+Integer.parseInt(b);
	}
	
	public static void main(String[] args) {
		Demo demo = new Demo();
		System.out.println(demo.add(1, 2));
		System.out.println(demo.add(1, 2, 3));
		System.out.println(demo.add(1, "23"));
	}
}
