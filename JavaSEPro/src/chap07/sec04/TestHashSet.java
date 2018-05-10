package chap07.sec04;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {

	public static void main(String[] args) {
		
		/**
		 * 1. HashSet是无序的
		 * 2. 不允许有重复的值
		 */
		HashSet<String> hs = new HashSet<String>();
		hs.add("1");
		hs.add("2");
		hs.add("3");
		hs.add("4");
		hs.add("1");
		
		/**
		 * 用 Iterator 遍历集合
		 */
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.print("s="+s+" ");
		}
		
	}
}
