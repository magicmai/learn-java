package chap03.sec02;

public class Person {
	
	String name;  // �����У�����һ������name�ַ���
	int age;      // �����У�����һ������age����
	
	public void speak() {
		System.out.println("My name is "+name+", I'm "+age+" years old.");
	}
	
	public static void main(String[] args) {
		// ����һ��person��Ķ���zhang
		Person zhang;
		// ʵ��������
		zhang = new Person();
		// ����������Ը�ֵ
		zhang.name = "ZhangSan";
		zhang.age = 19;
		zhang.speak();
	}
}
