package chap02.sec05;

public class Demo1 {

	public static void main(String[] args) {
		int a = 1;
		
		// if ���
		/*if (a>0) {
			System.out.println(a+"������");
		}*/
		
		// if...else ���
		/*if (a>0) {
			System.out.println(a+"������");
		} else {
			System.out.println(a+"��������");
		}*/
		
		// if...else if...else ���
		if (a>0) {
			System.out.println(a+"������");
		} else if(a<0) {
			System.out.println(a+"�Ǹ���");
		} else {
			System.out.println(a+"��0");
		}
	}
}
