package chap03.sec13;

public class Test2 {

	public static void main(String[] args) {
		
		// 父类引用指向 Dog 类的具体实现，向上转型
		Animal2 animal2 = new Dog2();
		animal2.say2();
		
		animal2 = new Cat2();
		animal2.say2();
		
		// 作业：接口实现向下转型
		/*Dog dog2 = (Dog) animal2;
		dog2.say();*/
	}
}
