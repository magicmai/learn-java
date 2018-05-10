package chap09.sec06;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JPasswordFieldTest {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("JPasswordField测试");
		
		jFrame.setLayout(new GridLayout(2,2,10,10));
		JLabel j1 = new JLabel("用户名：");
		JLabel j2 = new JLabel("密码：");
		JTextField jtf = new JTextField();
		JPasswordField jpf = new JPasswordField();
		jFrame.add(j1);
		jFrame.add(jtf);
		jFrame.add(j2);
		jFrame.add(jpf);
		
		jFrame.setLocation(400, 300);  // 设置容器的位置，左上角坐标
		jFrame.setSize(500, 100);      // 设置容器的大小
		jFrame.setVisible(true);       // 让容器显示
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
