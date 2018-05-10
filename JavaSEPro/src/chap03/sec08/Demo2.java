package chap03.sec08;

public class Demo2 {

	public static void main(String[] args) {
		String name1 = "Jack";  // 直接赋值方式
		String name2 = new String("Jack");  // new方式
		String name3 = name2;  // 传递引用
		
		// == 比较的是引用
		System.out.println("name1 == name2:"+(name1 == name2));  // false
		System.out.println("name1 == name3:"+(name1 == name3));  // false
		System.out.println("name2 == name3:"+(name2 == name3));  // true
		
		// equals() 比较的是内容
		System.out.println("name1.equals(name2):"+(name1.equals(name2)));  // true
		System.out.println("name1.equals(name3):"+(name1.equals(name3)));  // true
		System.out.println("name2.equals(name3):"+(name2.equals(name3)));  // true
	}
}
