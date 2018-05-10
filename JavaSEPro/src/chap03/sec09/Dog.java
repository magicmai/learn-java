package chap03.sec09;

/**
 * 定义 Dog 类，继承自 Animal 类
 * @author Magic
 *
 */
public class Dog extends Animal {
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("Doggi");
		dog.setAge(2);
		dog.say();
	}
}
