package chap09.sec04;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AbsoluteLayoutTest {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("���Բ��ֲ���");
		
		jFrame.setLayout(null);
		JButton jb1 = new JButton("��ť1");
		JButton jb2 = new JButton("��ť2");
		jFrame.add(jb1);
		jFrame.add(jb2);
		jb1.setBounds(50, 50, 100, 20);
		jb2.setBounds(10, 10, 100, 20);
		
		jFrame.setLocation(400, 300);  // ����������λ�ã����Ͻ�����
		jFrame.setSize(500, 200);      // ���������Ĵ�С
		jFrame.setVisible(true);       // ��������ʾ
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
