package chap03.sec09;

/**
 * 动物类
 * @author Magic
 *
 */
public class Animal {

	// 属性姓名
	private String name;
	// 属性年龄
	private int age;
	
	/**
	 * 无参父类构造方法
	 */
	public Animal() {
		System.out.println("父类无参构造方法");
	}
	
	/**
	 * 有参父类构造方法
	 * @param name 名字
	 * @param age  年龄
	 */
	public Animal(String name, int age) {
		System.out.println("父类有参构造方法");
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
	
	// 方法
	public void say() {
		System.out.println("I am "+getName()+". I am "+getAge()+" years old.");
	}
}
