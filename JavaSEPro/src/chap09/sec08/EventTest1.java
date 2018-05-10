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
		JOptionPane.showMessageDialog(null, "呀，被点击了");
	}
}

public class EventTest1 {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("Swing事件");
		
		JButton jb = new JButton("点击按钮");
		JButtonListener jButtonListener = new JButtonListener();
		jb.addActionListener(jButtonListener);  // 添加事件监听
		jFrame.add(jb);
		
		jFrame.setLocation(400, 300);  // 设置容器的位置，左上角坐标
		jFrame.setSize(500, 160);      // 设置容器的大小
		jFrame.setVisible(true);       // 让容器显示
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
