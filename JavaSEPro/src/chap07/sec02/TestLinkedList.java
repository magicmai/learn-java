package chap07.sec02;

import java.util.LinkedList;

public class TestLinkedList {

	public static void printLinkedList (LinkedList<String> linkedList) {
		System.out.println("当前元素集合：");
		for (int i=0; i<linkedList.size();i++) {
			System.out.print(linkedList.get(i)+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("L");
		linkedList.add("M");
		linkedList.add("N");
		linkedList.add("O");
		linkedList.add("P");
		linkedList.add("Q");
		printLinkedList(linkedList);
		System.out.println("----------------------");
		
		// 返回此列表中指定元素的第一次出现的索引，如果此列表不包含元素，则返回-1
		// System.out.println(linkedlist.indexOf("O"));
		// printLinkedList(linkedList);  // 不改变原集合
		
		// 检索但不删除此列表的第一个元素，如果此列表为空，则返回 null
		// System.out.println(linkedlist.peekFirst());
		// printLinkedList(linkedList);  // 不改变原集合
		
		// 检索但不删除此列表的最后一个元素，如果此列表为空，则返回 null
		// System.out.println(linkedList.peekLast());
		// printLinkedList(linkedList);  // 不改变原集合
		
		// 检索并删除此列表的第一个元素，如果此列表为空，则返回 null
		// System.out.println(linkedList.pollFirst());
		// printLinkedList(linkedList);  // 改变原集合!
		
		// 检索并删除此列表的最后一个元素，如果此列表为空，则返回 null
		System.out.println(linkedList.pollLast());
		printLinkedList(linkedList);  // 改变原集合!
		
	}
}
