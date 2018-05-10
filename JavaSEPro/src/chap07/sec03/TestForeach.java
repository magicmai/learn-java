package chap07.sec03;

import java.util.LinkedList;

import chap07.sec01.Student;

public class TestForeach {

	public static void main(String[] args) {
		LinkedList<Student> list = new LinkedList<Student>();
		list.add(new Student("Mike", 10));
		list.add(new Student("Noe", 11));
		list.add(new Student("Lily", 12));
		
		/**
		 * 用 foreach 遍历
		 */
		for (Student s:list) {
			System.out.println("姓名："+s.getName()+" 年龄："+s.getAge());
		}
	}
	
}
