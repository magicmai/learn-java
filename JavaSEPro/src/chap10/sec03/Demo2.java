package chap10.sec03;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Demo2 {

	public static void main(String[] args) throws IOException {
		File file = new File("D://Java//test.txt");
		InputStream inputStream = new FileInputStream(file);  // 实例化FileInputStream
		
		int fileLength = (int) file.length();
		byte b[] = new byte[fileLength];
		
		inputStream.read(b);
		inputStream.close();  // 关闭输入流
		System.out.println("读取到的内容：\n"+new String(b));
	}
}
