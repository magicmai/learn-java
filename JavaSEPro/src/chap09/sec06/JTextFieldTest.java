package chap09.sec06;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JTextFieldTest {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("JTextField����");
		
		jFrame.setLayout(new GridLayout(1,2,10,10));
		JLabel j1 = new JLabel("�û�����");
		JTextField jtf = new JTextField();
		jFrame.add(j1);
		jFrame.add(jtf);
		
		jFrame.setLocation(400, 300);  // ����������λ�ã����Ͻ�����
		jFrame.setSize(500, 70);      // ���������Ĵ�С
		jFrame.setVisible(true);       // ��������ʾ
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
