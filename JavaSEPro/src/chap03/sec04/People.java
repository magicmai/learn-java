package chap03.sec04;

public class People {

	// String 类属性默认值是 null
	private String name;
	// int 类属性的默认值是0
	private int age;
	
	/**
	 * 默认构造方法
	 */
	public People() {
		System.out.println("默认构造方法！");
	}
	
	/**
	 * 有参数的构造方法、构造方法的重载
	 */
	People(String name2, int age2) {
		name = name2;
		age = age2;
		System.out.println("有参数的构造方法！");
	}
	
	public void say() {
		System.out.println("My name is "+name+". I am "+age);
	}
	
	public static void main(String[] args) {
		People people = new People();
		people.say();
		People people2 = new People("张三", 28);
		people2.say();
	}
}