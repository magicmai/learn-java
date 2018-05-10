package chap09.sec09;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingTest1 {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("Swing示例测试");
		
		jFrame.setLayout(null);  // 使用绝对布局
		JTextField num1Txt = new JTextField();
		JTextField num2Txt = new JTextField();
		JLabel fuHao = new JLabel("+",JLabel.CENTER);
		JButton jb = new JButton("=");
		JTextField result = new JTextField();
		
		// 添加事件处理
		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String num1 = num1Txt.getText();  // 获取第一个数字文本
				String num2 = num2Txt.getText();  // 获取第二个数字文本
				int sum = Integer.parseInt(num1) + Integer.parseInt(num2);
				result.setText(sum+"");
			}
		});

		// 设置左上角坐标 x和y，宽高 width和height
		num1Txt.setBounds(20,30,50,25);
		fuHao.setBounds(80, 30, 40, 25);
		num2Txt.setBounds(130,30,50,25);
		jb.setBounds(190,30,50,25);
		result.setBounds(250,30,50,25);
		
		jFrame.add(num1Txt);
		jFrame.add(fuHao);
		jFrame.add(num2Txt);
		jFrame.add(jb);
		jFrame.add(result);
		
		jFrame.setLocation(400, 200);  // 设置容器的位置，左上角坐标
		jFrame.setSize(350, 150);      // 设置容器的大小
		jFrame.setVisible(true);       // 让容器显示
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
