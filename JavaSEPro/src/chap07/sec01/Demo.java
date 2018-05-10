package chap07.sec01;

import java.util.LinkedList;

public class Demo {

	public static void main(String[] args) {
//		Student student[] = new Student[3];
		Student s1 = new Student("Mike", 22);
		Student s2 = new Student("Milk", 23);
		Student s3 = new Student("Momo", 24);
		
		LinkedList<Student> list = new LinkedList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		/**
		 * ±éÀú¼¯ºÏ
		 */
		for (int i=0; i<list.size(); i++) {
			Student s = list.get(i);
			System.out.println(s.getName()+":"+s.getAge());
		}
		
	}
}
