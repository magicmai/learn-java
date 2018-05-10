package chap03.sec02;

public class Person {
	
	String name;  // 在类中，定义一个姓名name字符串
	int age;      // 在类中，定义一个年龄age属性
	
	public void speak() {
		System.out.println("My name is "+name+", I'm "+age+" years old.");
	}
	
	public static void main(String[] args) {
		// 定义一个person类的对象zhang
		Person zhang;
		// 实例化对象
		zhang = new Person();
		// 给对象的属性赋值
		zhang.name = "ZhangSan";
		zhang.age = 19;
		zhang.speak();
	}
}
