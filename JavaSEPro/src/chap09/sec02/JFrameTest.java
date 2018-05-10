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
		
		jFrame.getContentPane().setBackground(Color.WHITE);  // 设置容器的背景颜色
		jFrame.setLocation(400, 300);  // 设置容器的位置，左上角坐标
		jFrame.setSize(500, 200);      // 设置容器的宽高
		jFrame.setVisible(true);       // 让容器显示
		
	}
}
