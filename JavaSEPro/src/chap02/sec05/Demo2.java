package chap02.sec05;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		System.out.println("请输入一个数字：");
		// 定义一个系统输入对象
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		// System.out.println(n);
		
		switch (n) {
			case 1: {
				System.out.println("您输入了1");
				break;
			}
			case 2: {
				System.out.println("您输入了2");
				break;
			}
			default: {
				System.out.println("您输入了其他数字");
				break;
			}
		}
				
		
	}
}
