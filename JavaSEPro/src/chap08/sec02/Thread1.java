package chap08.sec02;

public class Thread1 extends Thread {

	private int baoZi = 1;
	
	private String threadName;

	public Thread1(String threadName) {
		super();
		this.threadName = threadName;
	}

	@Override
	public void run() {
		while (baoZi <= 10) {
			System.out.println(threadName+" 吃第"+baoZi+"包子");
			baoZi++;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("小A和小B一起吃包子，每人吃了10个：");
		Thread1 t1 = new Thread1("小A");
		Thread1 t2 = new Thread1("小B");
		t1.start();
		t2.start();
	}
	
	
}
