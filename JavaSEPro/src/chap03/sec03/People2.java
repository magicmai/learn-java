package chap03.sec03;

public class People2 {
	
	// 形参、入参
	void speak(String name) {
		System.out.println("My name is "+name+".");
	}
	
	public static void main(String[] args) {
		People2 john = new People2();
		john.speak("John");
		
		People2 jack = new People2();
		jack.speak("Jack");
	}
}
