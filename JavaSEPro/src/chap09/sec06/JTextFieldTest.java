package chap09.sec06;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JTextFieldTest {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("JTextField测试");
		
		jFrame.setLayout(new GridLayout(1,2,10,10));
		JLabel j1 = new JLabel("用户名：");
		JTextField jtf = new JTextField();
		jFrame.add(j1);
		jFrame.add(jtf);
		
		jFrame.setLocation(400, 300);  // 设置容器的位置，左上角坐标
		jFrame.setSize(500, 70);      // 设置容器的大小
		jFrame.setVisible(true);       // 让容器显示
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
