package chap04.sec03;

public class Demo2 {

	public static void testThrow(int a) throws Exception {
		if (a == 2) {
			// ֱ���׳�һ���쳣��
			throw new Exception("Error");
		}
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		try {
			testThrow(1);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
