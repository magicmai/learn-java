package chap03.sec08;

public class demo3 {

	public static void main(String[] args) {
		// ָ��ͬһ������
		String name1 = "Sam";
		String name2 = "Sam";
		
		// ��������������
		String name3 = new String("Sam");
		String name4 = new String("Sam");
		
		System.out.println("name1 == name2:"+(name1 == name2));  // true
		System.out.println("name1 == name3:"+(name1 == name3));  // false
		System.out.println("name3 == name4:"+(name3 == name4));  // false
	}
}
