package chap03.sec03;

public class Demo2 {

	void fun1() {
		System.out.println("��������ͨ����������.����");
	}
	
	static void fun2() {
		System.out.println("�����˾�̬����������.����");
	}
	
	public static void main(String[] args) {
		Demo2 demo2 = new Demo2();
		// ������ͨ����
		demo2.fun1();
		
		// ���þ�̬����1������.���������ã�
		Demo2.fun2();
		
		// ���þ�̬����2������.����
		// demo2.fun2();
	}
}
