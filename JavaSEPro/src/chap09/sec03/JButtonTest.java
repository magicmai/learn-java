package chap09.sec03;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonTest {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("JButton测试");
		
		JButton jb = new JButton("Button");
		jFrame.add(jb);
		
		jFrame.getContentPane().setBackground(Color.black);  // 设置容器的背景颜色
		jFrame.setLocation(400, 300);  // 设置容器的位置，左上角坐标
		jFrame.setSize(500, 200);      // 设置容器的大小
		jFrame.setVisible(true);       // 让容器显示
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
