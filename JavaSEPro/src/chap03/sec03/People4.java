package chap03.sec03;

public class People4 {

	// 形参、入参，不定参数...<name>
	// 返回类型
	int speak(String name, int age, String ...hobbies) {
		System.out.println("My name is "+name+". I am "+age+".");
		System.out.println("My hobbies:");
		for(String hobby:hobbies){
			System.out.println(hobby);
		}
		// 获取爱好的长度
//		int totalHobbies = hobbies.length;
//		return totalHobbies;
		return hobbies.length;
	}
			
	public static void main(String[] args) {
		People4 john = new People4();
		int n = john.speak("John", 23, "reading", "singing");
		System.out.println("total " + n + " hobbies.");
	}
}
