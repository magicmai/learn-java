package chap03.sec07;

public class Demo3 {

	/**
	 * �����
	 */
	{
		System.out.println("ͨ�ù���飡");
	}
	
	/**
	 * ��̬����飬����ִ�У�ִֻ��һ�Σ�
	 */
	static {
		System.out.println("��̬����飡");
	}
	
	/**
	 * ���췽��һ
	 */
	public Demo3() {
		System.out.println("���췽��һ");
	}
	
	/**
	 * ���췽����
	 */
	public Demo3(int i) {
		System.out.println("���췽����");
	}
	
	/**
	 * ���췽����
	 */
	public Demo3(int i, int j) {
		System.out.println("���췽����");
	}
	
	public static void main(String[] args) {
		new Demo3();
		new Demo3(1);
		new Demo3(1, 2);
	}
}
