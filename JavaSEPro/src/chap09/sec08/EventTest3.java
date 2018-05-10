package chap09.sec08;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

class MyWindowAdapter extends WindowAdapter {

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		super.windowClosing(e);
		System.out.println("���ڹر�......");
	}
	
}

public class EventTest3 {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("Swing�¼�");
		
//		MyWindowAdapter myWindowAdapter = new MyWindowAdapter();
//		jFrame.addWindowListener(myWindowAdapter);
		
		jFrame.addWindowListener(new WindowAdapter(){

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				System.out.println("���ڹر�......");
			}
		});
		
		jFrame.setLocation(400, 300);  // ����������λ�ã����Ͻ�����
		jFrame.setSize(500, 160);      // ���������Ĵ�С
		jFrame.setVisible(true);       // ��������ʾ
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
