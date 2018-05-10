package chap03.sec04;

public class People2 {

	// String 类属性默认值是 null
	private String name;
	// int 类属性的默认值是0
	private int age;
	
	/**
	 * 默认构造方法
	 */
	People2() {
		System.out.println("调用默认构造方法！");
	}
	
	/**
	 * 有参数的构造方法、构造方法的重载
	 */
	People2(String name, int age) {
		this();
		this.name = name;
		this.age = age;
		System.out.println("调用有参数的构造方法！");
	}
	
	public void say() {
		System.out.println("My name is "+name+". I am "+age);
	}
	
	public static void main(String[] args) {
		// People people = new People();
		People2 people2 = new People2("张三", 28);
		people2.say();
	}
}
