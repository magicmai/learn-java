package chap09.sec04;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AbsoluteLayoutTest {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("绝对布局测试");
		
		jFrame.setLayout(null);
		JButton jb1 = new JButton("按钮1");
		JButton jb2 = new JButton("按钮2");
		jFrame.add(jb1);
		jFrame.add(jb2);
		jb1.setBounds(50, 50, 100, 20);
		jb2.setBounds(10, 10, 100, 20);
		
		jFrame.setLocation(400, 300);  // 设置容器的位置，左上角坐标
		jFrame.setSize(500, 200);      // 设置容器的大小
		jFrame.setVisible(true);       // 让容器显示
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
