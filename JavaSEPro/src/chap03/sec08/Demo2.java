package chap03.sec08;

public class Demo2 {

	public static void main(String[] args) {
		String name1 = "Jack";  // ֱ�Ӹ�ֵ��ʽ
		String name2 = new String("Jack");  // new��ʽ
		String name3 = name2;  // ��������
		
		// == �Ƚϵ�������
		System.out.println("name1 == name2:"+(name1 == name2));  // false
		System.out.println("name1 == name3:"+(name1 == name3));  // false
		System.out.println("name2 == name3:"+(name2 == name3));  // true
		
		// equals() �Ƚϵ�������
		System.out.println("name1.equals(name2):"+(name1.equals(name2)));  // true
		System.out.println("name1.equals(name3):"+(name1.equals(name3)));  // true
		System.out.println("name2.equals(name3):"+(name2.equals(name3)));  // true
	}
}
