package chap07.sec02;

import java.util.LinkedList;

public class TestLinkedList {

	public static void printLinkedList (LinkedList<String> linkedList) {
		System.out.println("��ǰԪ�ؼ��ϣ�");
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
		
		// ���ش��б���ָ��Ԫ�صĵ�һ�γ��ֵ�������������б�����Ԫ�أ��򷵻�-1
		// System.out.println(linkedlist.indexOf("O"));
		// printLinkedList(linkedList);  // ���ı�ԭ����
		
		// ��������ɾ�����б�ĵ�һ��Ԫ�أ�������б�Ϊ�գ��򷵻� null
		// System.out.println(linkedlist.peekFirst());
		// printLinkedList(linkedList);  // ���ı�ԭ����
		
		// ��������ɾ�����б�����һ��Ԫ�أ�������б�Ϊ�գ��򷵻� null
		// System.out.println(linkedList.peekLast());
		// printLinkedList(linkedList);  // ���ı�ԭ����
		
		// ������ɾ�����б�ĵ�һ��Ԫ�أ�������б�Ϊ�գ��򷵻� null
		// System.out.println(linkedList.pollFirst());
		// printLinkedList(linkedList);  // �ı�ԭ����!
		
		// ������ɾ�����б�����һ��Ԫ�أ�������б�Ϊ�գ��򷵻� null
		System.out.println(linkedList.pollLast());
		printLinkedList(linkedList);  // �ı�ԭ����!
		
	}
}
