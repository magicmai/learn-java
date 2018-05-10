package chap06.sec03;

import chap06.sec02.Animal;
import chap06.sec02.Cat;
import chap06.sec02.Demo;
import chap06.sec02.Dog;

public class Test {

	/**
	 * Í¨Åä·û·ºÐÍ
	 * @param a
	 */
	private static void take(Demo<?> a) {
		a.print();
	}
	
	public static void main(String[] args) {
		
		Demo<Dog> dog = new Demo<Dog>(new Dog());
		take(dog);
		Demo<Cat> cat = new Demo<Cat>(new Cat());
		take(cat);
		Demo<Animal> animal = new Demo<Animal>(new Animal());
		take(animal);
	}
}
