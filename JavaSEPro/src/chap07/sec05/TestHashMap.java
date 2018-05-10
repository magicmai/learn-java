package chap07.sec05;

import java.util.HashMap;
import java.util.Iterator;

import chap07.sec01.Student;

public class TestHashMap {

	public static void main(String[] args) {
		HashMap<String, Student> hashMap = new HashMap<String, Student>();
		hashMap.put("1号", new Student("Number1", 21));
		hashMap.put("2号", new Student("Number2", 22));
		hashMap.put("3号", new Student("Number3", 23));
		
		// 通过 key，获取 value
		Student s = hashMap.get("1号");
		System.out.println(s.getName()+"："+s.getAge());
		
		Iterator<String> it = hashMap.keySet().iterator();  // 获取 key 的集合，再获取迭代器
		while (it.hasNext()) {
			String key = it.next();  // 获取 key
			Student student = hashMap.get(key);  // 通过 key 获取 value
			System.out.println("key="+key+" value=["+student.getName()+","+student.getAge()+"]");
		}
		
	}
}
