package chap02.sec05;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		System.out.println("������һ�����֣�");
		// ����һ��ϵͳ�������
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		// System.out.println(n);
		
		switch (n) {
			case 1: {
				System.out.println("��������1");
				break;
			}
			case 2: {
				System.out.println("��������2");
				break;
			}
			default: {
				System.out.println("����������������");
				break;
			}
		}
				
		
	}
}
