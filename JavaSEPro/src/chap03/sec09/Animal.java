package chap03.sec09;

/**
 * ������
 * @author Magic
 *
 */
public class Animal {

	// ��������
	private String name;
	// ��������
	private int age;
	
	/**
	 * �޲θ��๹�췽��
	 */
	public Animal() {
		System.out.println("�����޲ι��췽��");
	}
	
	/**
	 * �вθ��๹�췽��
	 * @param name ����
	 * @param age  ����
	 */
	public Animal(String name, int age) {
		System.out.println("�����вι��췽��");
		this.name = name;
		this.age = age; 
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	// ����
	public void say() {
		System.out.println("I am "+getName()+". I am "+getAge()+" years old.");
	}
}
