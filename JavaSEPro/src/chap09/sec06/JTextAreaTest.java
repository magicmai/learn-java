package chap09.sec06;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JTextAreaTest {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("JTextArea����");
		
		jFrame.setLayout(new GridLayout(3,2,10,10));
		JLabel j1 = new JLabel("�û�����");
		JLabel j2 = new JLabel("���룺");
		JLabel j3 = new JLabel("��飺");
		JTextField jtf = new JTextField();
		JPasswordField jpf = new JPasswordField();
		JTextArea jta = new JTextArea();
		jFrame.add(j1);
		jFrame.add(jtf);
		jFrame.add(j2);
		jFrame.add(jpf);
		jFrame.add(j3);
		jFrame.add(jta);
		
		jFrame.setLocation(400, 300);  // ����������λ�ã����Ͻ�����
		jFrame.setSize(500, 300);      // ���������Ĵ�С
		jFrame.setVisible(true);       // ��������ʾ
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
