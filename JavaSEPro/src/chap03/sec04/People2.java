package chap03.sec04;

public class People2 {

	// String ������Ĭ��ֵ�� null
	private String name;
	// int �����Ե�Ĭ��ֵ��0
	private int age;
	
	/**
	 * Ĭ�Ϲ��췽��
	 */
	People2() {
		System.out.println("����Ĭ�Ϲ��췽����");
	}
	
	/**
	 * �в����Ĺ��췽�������췽��������
	 */
	People2(String name, int age) {
		this();
		this.name = name;
		this.age = age;
		System.out.println("�����в����Ĺ��췽����");
	}
	
	public void say() {
		System.out.println("My name is "+name+". I am "+age);
	}
	
	public static void main(String[] args) {
		// People people = new People();
		People2 people2 = new People2("����", 28);
		people2.say();
	}
}
