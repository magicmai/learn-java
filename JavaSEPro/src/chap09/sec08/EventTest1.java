package chap09.sec08;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class JButtonListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "ѽ���������");
	}
}

public class EventTest1 {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("Swing�¼�");
		
		JButton jb = new JButton("�����ť");
		JButtonListener jButtonListener = new JButtonListener();
		jb.addActionListener(jButtonListener);  // ����¼�����
		jFrame.add(jb);
		
		jFrame.setLocation(400, 300);  // ����������λ�ã����Ͻ�����
		jFrame.setSize(500, 160);      // ���������Ĵ�С
		jFrame.setVisible(true);       // ��������ʾ
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
