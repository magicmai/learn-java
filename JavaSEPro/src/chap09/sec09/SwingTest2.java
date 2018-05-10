package chap09.sec09;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class SwingTest2 {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("Swingʾ������");
		
		jFrame.setLayout(null);  // ʹ�þ��Բ���
		final JTextField num1Txt = new JTextField();
		final JTextField num2Txt = new JTextField();
		// JLabel fuHao = new JLabel("+",JLabel.CENTER);
		String fuHao[] = {"+","-","*","/"};
		final JComboBox<?> jcb = new JComboBox<Object>(fuHao);
		final JTextField result = new JTextField();
		JButton jb = new JButton("=");
		
		// ����¼�����
		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String num1 = num1Txt.getText();  // ��ȡ��һ�������ı�
				String num2 = num2Txt.getText();  // ��ȡ�ڶ��������ı�
				String fuHao = (String) jcb.getSelectedItem();
				// int sum = Integer.parseInt(num1) + Integer.parseInt(num2);
				int sum = 0;
				switch(fuHao) {
					case "+":
						sum = Integer.parseInt(num1) + Integer.parseInt(num2);
						break;
					case "-":
						sum = Integer.parseInt(num1) - Integer.parseInt(num2);
						break;
					case "*":
						sum = Integer.parseInt(num1) * Integer.parseInt(num2);
						break;
					case "/":
						sum = Integer.parseInt(num1) / Integer.parseInt(num2);
						break;
				}
				result.setText(sum+"");
			}
		});

		// �������Ͻ����� x��y����� width��height
		num1Txt.setBounds(20,30,50,25);
		// fuHao.setBounds(80, 30, 40, 25);
		jcb.setBounds(80, 30, 40, 25);
		num2Txt.setBounds(130,30,50,25);
		jb.setBounds(190,30,50,25);
		result.setBounds(250,30,50,25);
		
		jFrame.add(num1Txt);
		// jFrame.add(fuHao);
		jFrame.add(jcb);
		jFrame.add(num2Txt);
		jFrame.add(jb);
		jFrame.add(result);
		
		jFrame.setLocation(400, 200);  // ����������λ�ã����Ͻ�����
		jFrame.setSize(350, 150);      // ���������Ĵ�С
		jFrame.setVisible(true);       // ��������ʾ
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
