package chap04.sec02;

public class Demo1 {

	public static void main(String[] args) {
		String s = "123q";
		try {
			int s1 = Integer.parseInt(s);			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (Exception e) {  // ��Χ������������
			e.printStackTrace();
		}
		System.out.println("run");
	}
}
