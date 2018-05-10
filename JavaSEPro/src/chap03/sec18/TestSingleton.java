package chap03.sec18;

public class TestSingleton {

	public static void main(String[] args) {
		Singleton1 single1 = Singleton1.getInstance();
		Singleton1 single2 = Singleton1.getInstance();
		System.out.println("¶öººÊ½£º"+(single1 == single2));  // true
		
		TestSingleton t1 = new TestSingleton();
		TestSingleton t2 = new TestSingleton();
		System.out.println(t1 == t2);  // false
		
		Singleton2 single3 = Singleton2.getInstance();
		Singleton2 single4 = Singleton2.getInstance();
		System.out.println("ÀÁººÊ½£º"+(single3 == single4));  // true
		
	}
	
}
