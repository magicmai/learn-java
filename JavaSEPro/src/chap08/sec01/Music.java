package chap08.sec01;

public class Music extends Thread {

	@Override
	public void run() {
		for (int i=0;i<100;i++) {
			try {
				Thread.sleep(100);
				System.out.println("������");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}