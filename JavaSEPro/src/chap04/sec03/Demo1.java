package chap04.sec03;

public class Demo1 {

	/**
	 * 把异常向外面抛
	 * @throws NumberFormatException
	 */
	public static void testThrows() throws NumberFormatException {
		String s = "123a";
		int a = Integer.parseInt(s);
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		try {
			testThrows();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("处理异常");
			e.printStackTrace();
		}
		
		System.out.println("mark");
	}
}
