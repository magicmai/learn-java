package chap03.sec03;

class favNumber{
	int x;
	int y;
	int z;
}

public class People5 {

	void speak(int age, favNumber fnum){
		System.out.println("I am "+age+". My favorite numbers are "
				+ fnum.x + ", " + fnum.y + ", " + fnum.z);
		age = 24;
		fnum.z = 999999;
	}
	
	public static void main(String[] args) {
		People5 Lily = new People5();
		int age = 12;
		favNumber fnum = new favNumber();
		fnum.x = 7;
		fnum.y = 21;
		fnum.z = 99;
		
		Lily.speak(age, fnum);
		
		// age 传递的是数值
		System.out.println("age 传值："+age);
		// fnum 传递的是引用（地址），C语言中称为指针
		System.out.println("fnum.z 传引用："+fnum.z);
	}
}
