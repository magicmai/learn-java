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
		 * �� foreach ����
		 */
		for (Student s:list) {
			System.out.println("������"+s.getName()+" ���䣺"+s.getAge());
		}
	}
	
}
