package chap08.sec04;

public class Demo5 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=0;i<10;i++) {
			try {
				Thread.sleep(100);
				// ��ȡ��ǰ�߳�
				Thread t = Thread.currentThread();
				System.out.println(t.getName()+":"+i);  // ���ش��̵߳�����
				if (i == 5) {
					System.out.println("�߳����ã�");
					Thread.currentThread();
					Thread.yield();
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		Demo5 demo5 = new Demo5();
		new Thread(demo5, "�߳�A").start();
		new Thread(demo5, "�߳�B").start();
	}	
}