package chap09.sec02;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class JFrameTest {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("Program");
		
//		Container c = jFrame.getContentPane();
//		c.setBackground(new Color(255, 0, 0));
//		c.setBackground(Color.black);
		
		jFrame.getContentPane().setBackground(Color.WHITE);  // ���������ı�����ɫ
		jFrame.setLocation(400, 300);  // ����������λ�ã����Ͻ�����
		jFrame.setSize(500, 200);      // ���������Ŀ��
		jFrame.setVisible(true);       // ��������ʾ
		
	}
}
