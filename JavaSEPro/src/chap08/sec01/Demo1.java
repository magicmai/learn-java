package chap08.sec01;

public class Demo1 {

	/**
	 * listen music
	 */
	private static void music() {
		for (int i=0;i<100;i++) {
			System.out.println("听音乐");
		}
	}
	
	/**
	 * have lunch
	 */
	private static void eat() {
		for (int i=0;i<100;i++) {
			System.out.println("吃饭");
		}
	}
	
	public static void main(String[] args) {
		/*music();
		eat();*/
		
		/**
		 * 用多线程实现一边吃饭一边听歌
		 */
		Music musicThread = new Music();
		Eat eatThread = new Eat();
		musicThread.start();
		eatThread.start();
	}
}
