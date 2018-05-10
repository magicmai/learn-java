package chap07.sec05;

import java.util.HashMap;
import java.util.Iterator;

import chap07.sec01.Student;

public class TestHashMap {

	public static void main(String[] args) {
		HashMap<String, Student> hashMap = new HashMap<String, Student>();
		hashMap.put("1��", new Student("Number1", 21));
		hashMap.put("2��", new Student("Number2", 22));
		hashMap.put("3��", new Student("Number3", 23));
		
		// ͨ�� key����ȡ value
		Student s = hashMap.get("1��");
		System.out.println(s.getName()+"��"+s.getAge());
		
		Iterator<String> it = hashMap.keySet().iterator();  // ��ȡ key �ļ��ϣ��ٻ�ȡ������
		while (it.hasNext()) {
			String key = it.next();  // ��ȡ key
			Student student = hashMap.get(key);  // ͨ�� key ��ȡ value
			System.out.println("key="+key+" value=["+student.getName()+","+student.getAge()+"]");
		}
		
	}
}
