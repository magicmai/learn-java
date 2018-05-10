package chap09.sec04;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * FlowLayout ��ʽ���� 
 * @author Magic
 *
 */
public class FlowLayoutTest {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("FlowLayout����");
		
		jFrame.setLayout(new FlowLayout(FlowLayout.LEFT,15,15));
		JButton jb = null;
		for(int i=0;i<9;i++) {
			jb = new JButton("JButton"+i);
			jFrame.add(jb);
		}
		
		jFrame.setLocation(400, 300);  // ����������λ�ã����Ͻ�����
		jFrame.setSize(500, 200);      // ���������Ĵ�С
		jFrame.setVisible(true);       // ��������ʾ
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
