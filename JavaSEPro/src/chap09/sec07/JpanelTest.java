package chap09.sec07;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class JpanelTest {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("JPanel������");
		
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new GridLayout(3,2,10,10));
		jPanel.setBorder(new EmptyBorder(10,10,10,10));
		jFrame.add(jPanel);
		
		JLabel j1 = new JLabel("�û�����");
		JTextField jtf = new JTextField();
		JLabel j2 = new JLabel("���룺");
		JPasswordField jpf = new JPasswordField();
		JButton jb1 = new JButton("��¼");
		JButton jb2 = new JButton("����");
		jPanel.add(j1);
		jPanel.add(jtf);
		jPanel.add(j2);
		jPanel.add(jpf);
		jPanel.add(jb1);
		jPanel.add(jb2);
		
		jFrame.setLocation(400, 300);  // ����������λ�ã����Ͻ�����
		jFrame.setSize(300, 160);      // ���������Ĵ�С
		jFrame.setVisible(true);       // ��������ʾ
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
