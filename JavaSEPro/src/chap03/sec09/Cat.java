package chap03.sec09;

// Cat �̳� Animal
public class Cat extends Animal {
	
	private String address;
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Cat() {
		super();
		System.out.println("�����޲ι��췽��");
	}

	public Cat(String name, int age, String address) {
		super(name, age);
		this.address = address;
		System.out.println("�����вι��췽��");
	}

	/**
	 * ��д����� say ����
	 */
	public void say() {
		// ���ø���� say() ����
		super.say();
		System.out.println("I am a cat, my name is "+this.getName()+". I am "+this.getAge()+". I am from "+this.address);
	}
	
	public static void main(String[] args) {
//		Cat cat = new Cat();
//		cat.setName("Nini");
//		cat.setAge(1);
//		cat.say();
		
		Cat cat = new Cat("Nini", 2, "Japan");
		cat.say();
	}
}
