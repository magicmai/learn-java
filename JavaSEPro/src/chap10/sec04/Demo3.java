package chap10.sec04;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class Demo3 {

	public static void main(String[] args) throws Exception {
		File file = new File("D://Java//test.txt");
		Writer out = new FileWriter(file);
		String str = "�Ұ������֣����أ�";
		out.write(str);  // ���ַ���д�������
		out.close();  // �ر������
	}
}
