package chap04.sec03;

public class Demo1 {

	/**
	 * ���쳣��������
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
			System.out.println("�����쳣");
			e.printStackTrace();
		}
		
		System.out.println("mark");
	}
}
