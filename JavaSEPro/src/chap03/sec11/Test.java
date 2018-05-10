package chap03.sec11;

public class Test {

	public static void main(String[] args) {
		// 抽象类不能被实例化！只能被继承。
		// People p = new People();
		
		Student student = new Student();
		student.profession();
		
		Teacher teacher = new Teacher();
		teacher.profession();
	}
}
