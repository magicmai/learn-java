package chap05.sec04;

import java.util.Arrays;

public class TestArrays {

	public static void main(String[] args) {
		int arr[] = {9, 2, 3, 8, 4};
//		System.out.println(arr);
		
		System.out.println("�ַ�����ʽ�����"+Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println("���������ַ�����"+Arrays.toString(arr));
		
		// �������ź��������
		System.out.println("2���ڵ�λ��������"+Arrays.binarySearch(arr, 2));
		
		// ��ָ��������䵽�����У��൱������
		Arrays.fill(arr, 100);
		System.out.println("��������ַ�����"+Arrays.toString(arr));
	}
}
