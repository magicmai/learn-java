package chap07.sec02;

import java.util.ArrayList;

public class TestArrayList {

	public static void printArrayList(ArrayList<String> arrayList) {
		System.out.println("��ǰ�ļ���Ԫ�أ�");
		for (int i=0;i<arrayList.size();i++) {
			System.out.print(arrayList.get(i)+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		// ���Ԫ��
		arrayList.add("Momo");
		arrayList.add("Nini");
		printArrayList(arrayList);
		
		// ��ָ����Ԫ�ز�����б��е�ָ��λ��
		arrayList.add(1, "Insert");
		printArrayList(arrayList);
		
		// ��ָ����Ԫ��������б���ָ��λ���ϵ�Ԫ��
		arrayList.set(2, "John");
		printArrayList(arrayList);
		
		// �Ƴ����б���ָ��λ���ϵ�Ԫ��
		arrayList.remove(1);
		printArrayList(arrayList);
	}
}
