package chap03.sec03;

public class People {

	void speak() {
		System.out.println("My name is John.");
	}
	
	public static void main(String[] args) {
		People john = new People();
		john.speak();
	}
}
