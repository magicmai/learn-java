package chap09.sec03;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonTest {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("JButton����");
		
		JButton jb = new JButton("Button");
		jFrame.add(jb);
		
		jFrame.getContentPane().setBackground(Color.black);  // ���������ı�����ɫ
		jFrame.setLocation(400, 300);  // ����������λ�ã����Ͻ�����
		jFrame.setSize(500, 200);      // ���������Ĵ�С
		jFrame.setVisible(true);       // ��������ʾ
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
