package chap08.sec01;

public class Demo1 {

	/**
	 * listen music
	 */
	private static void music() {
		for (int i=0;i<100;i++) {
			System.out.println("������");
		}
	}
	
	/**
	 * have lunch
	 */
	private static void eat() {
		for (int i=0;i<100;i++) {
			System.out.println("�Է�");
		}
	}
	
	public static void main(String[] args) {
		/*music();
		eat();*/
		
		/**
		 * �ö��߳�ʵ��һ�߳Է�һ������
		 */
		Music musicThread = new Music();
		Eat eatThread = new Eat();
		musicThread.start();
		eatThread.start();
	}
}
