package chap10.sec03;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Demo5 {

	public static void main(String[] args) throws Exception {
		
		File file = new File("D://Java//test.txt");
		
		OutputStream out = new FileOutputStream(file, true);  // ������� true��׷�����ݣ�������
		
		String str = "How do you do?";
		byte b[] = str.getBytes();
		out.write(b);  // ��b�ֽ�����д�뵽�����
		out.close();   // �ر�ʱ�����
		
	}
}
