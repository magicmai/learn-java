package chap03.sec09;

/**
 * ���� Dog �࣬�̳��� Animal ��
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
