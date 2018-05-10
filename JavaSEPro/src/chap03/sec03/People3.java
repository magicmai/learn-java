package chap03.sec03;

public class People3 {

	// 形参、入参
	void speak(String name, int age) {
		System.out.println("My name is "+name+". I am "+age+".");
	}
		
	public static void main(String[] args) {
		People3 john = new People3();
		john.speak("John", 23);
	}	
}
