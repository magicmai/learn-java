package chap04.sec02;

public class Demo2 {

	public static void testFinally() {
		String str = "123a";
		try {
			int a = Integer.parseInt(str);
			System.out.println(a);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("exception");
			return;
		} finally {  // 就算有return，finally也一定要执行
			System.out.println("finally...end");
		}
		System.out.println("end");
	}
	
	public static void main(String[] args) {
		testFinally();
	}
}
