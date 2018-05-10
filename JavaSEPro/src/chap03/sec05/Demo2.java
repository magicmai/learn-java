package chap03.sec05;

import chap03.sec04.People;

public class Demo2 {

	public static void main(String[] args) {
		// 不同包里的，则需要导入相关类
		People people = new People();
		// people.say();
		
		// 同一个包里的，则不需要导入相关类
		Demo1 demo1 = new Demo1();
	}
}
