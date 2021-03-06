package chap03.sec15;

public class Test {
	
	public static void doSomething(Animal animal) {
		animal.say();
		
		if (animal instanceof Dog) {
			((Dog) animal).f1();
		}
		if (animal instanceof Cat) {
			((Cat) animal).f2();
		}
	}

	public static void main(String[] args) {
		Animal dog = new Dog();
		System.out.println("dog对象是否属于Animal类："+(dog instanceof Animal));
		System.out.println("dog对象是否属于Dog类："+(dog instanceof Dog));
		System.out.println("dog对象是否属于Cat类："+(dog instanceof Cat));
		
		doSomething(new Dog());
		doSomething(new Cat());
	}
}
