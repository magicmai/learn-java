package chap03.sec08;

public class Demo7 {

	public static void main(String[] args) {
		// substring() ����ʹ��
		String str = "������ÿһ�죬smile~";
		
		String substr = str.substring(1);
		System.out.println(substr);
		
		String substr2 = str.substring(1, 6);
		System.out.println(substr2);
	}
}
