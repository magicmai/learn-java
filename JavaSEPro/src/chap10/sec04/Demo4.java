package chap10.sec04;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class Demo4 {

	public static void main(String[] args) throws Exception {
		File file = new File("D://Java//test.txt");
		Writer out = new FileWriter(file, true);  // true--׷��
		String str = "--��Ҳ�ǡ�";
		out.write(str);  // ���ַ���д�������
		out.close();  // �ر������
	}
}
